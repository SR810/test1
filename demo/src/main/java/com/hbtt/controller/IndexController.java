package com.hbtt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import io.swagger.annotations.ApiOperation;

@Controller
@RequestMapping(value="/index")
public class IndexController {
	
	@ApiOperation(value = "获取用户列表",notes = "")
	@RequestMapping(method=RequestMethod.GET)
	public String index() {
		
		return "index";
	}
	
}
