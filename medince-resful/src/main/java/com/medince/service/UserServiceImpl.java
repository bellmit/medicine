package com.medince.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medince.mapper.UserMapper;
import com.medince.service.inteface.UserService;
import com.taotao.pojo.User;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserMapper userMapper;
	
	@Override
	public String login(String username, String pasword) {
		// TODO Auto-generated method stub
		
		User record = new User();
		record.setUserId(2L);
		record.setUserName(username);
		record.setPassword(pasword);
		
		userMapper.insert(record);
		
		return username;
	}

}
