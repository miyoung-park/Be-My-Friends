package com.bemyfriend.bmf.member.user.model.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bemyfriend.bmf.member.user.model.repository.UserRepository;
import com.bemyfriend.bmf.member.user.model.service.UserService;
import com.bemyfriend.bmf.member.user.model.vo.User;

@Service // @Component 와 다를 것이 없음.
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	
	public UserServiceImpl(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	
	@Override
	public User memberAuthenticate(String userId, String userPw) {
		
		return userRepository.memberAuthenticate(userId, userPw);
	}

	@Override
	public User selectMemberById(String userId) {
		
		return userRepository.selectMemberById(userId);
	}


	@Override
	public void authenticateEmail(User persistInfo, String authPath) {
		
		
	}
	
	

}