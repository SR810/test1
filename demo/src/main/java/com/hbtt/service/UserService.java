package com.hbtt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hbtt.dao.UserMapper;
import com.hbtt.entiy.User;

@Service
public class UserService {
	@Autowired
	private UserMapper userMapper;
	
	public List<User> getAllUser(){
		return userMapper.getAllUser();
	}
}
