package com.bemyfriend.bmf.member.user.model.service.impl;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bemyfriend.bmf.common.mail.MailSender;
import com.bemyfriend.bmf.member.user.model.repository.UserRepository;
import com.bemyfriend.bmf.member.user.model.service.UserService;
import com.bemyfriend.bmf.member.user.model.vo.User;

@Service // @Component 와 다를 것이 없음.
public class UserServiceImpl implements UserService {

	
	private final UserRepository userRepository;
	
	@Autowired
	private MailSender mail;
	
	
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
	public void authenticateEmail(User persistUser) {
		
		mail.send(persistUser.getUserMail(), "회원가입을 축하합니다.", "<h1>회원가입을 축하합니다.</h1>");
		
		
	}
	
	

}
