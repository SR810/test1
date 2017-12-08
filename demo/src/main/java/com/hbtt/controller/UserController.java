package com.hbtt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hbtt.entiy.User;
import com.hbtt.service.UserService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value="users")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@ApiOperation(value="获取用户列表", notes="")
	@RequestMapping(method=RequestMethod.GET)
	public List<User> getAllUser(){
		return this.userService.getAllUser();
	}
	
	
}
