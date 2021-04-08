package com.bemyfriend.bmf.member.user.model.service.impl;




import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.bemyfriend.bmf.common.code.ConfigCode;
import com.bemyfriend.bmf.common.mail.MailSender;
import com.bemyfriend.bmf.member.user.model.repository.UserRepository;
import com.bemyfriend.bmf.member.user.model.service.UserService;
import com.bemyfriend.bmf.member.user.model.vo.User;

@Service // @Component 와 다를 것이 없음.
public class UserServiceImpl implements UserService {

	
	private final UserRepository userRepository;
	
	@Autowired
	private MailSender mail;
	@Autowired
	private RestTemplate http;
	
	@Bean //RestTemplate Bean 생성오류로 직접 Bean으로 생성
	public RestTemplate restTemplate() {
	    return new RestTemplate();
	}
	
	
	
	public UserServiceImpl(UserRepository userRepository) {
		this.userRepository = userRepository;
	
	 }
	
	
	
	
	
	@Override
	public User memberAuthenticate(User user) {
		
		
		String userId = user.getUserId();
		String userPw = user.getUserPw();
		
		return userRepository.memberAuthenticate(userId ,userPw );
	}
	
	

	@Override //idCheck
	public User selectMemberById(String userId) {
		
		return userRepository.selectMemberById(userId);
	}


	
	@Override
	public void authenticateEmail(Map<String, String> persistUser) {
		
		
		persistUser.put("mail-template", "temp_join");
		
		RequestEntity<Map<String, String>> request = RequestEntity
														.post(ConfigCode.DOMAIN+"/mail")
														.body(persistUser); //body에 담을 타입과 반환될 RequestEntity의 제네릭 타입이 일치해야함.
		
		// Content-type을 설정해주지 않으면 application/json 으로 넘어가기 떄문에 RequestParam으로 못 받게 되기 떄문에
		// 이 부분에 대해서 설정해주어야 함.
		 
		//템플릿에 보내줘야 할 값 : userId
		// (RequestEntity, 원하는 Response 타입)
		ResponseEntity<String> response = http.exchange(request, String.class);
		String message = response.getBody();
		System.out.println(message);
		
		
		mail.send(persistUser.get("userId"), "회원가입을 축하합니다.", message);
		
		
	}
	
	

}
