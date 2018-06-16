package com.shangxin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.shangxin.bean.User;
import com.shangxin.serivce.userSerivce;

@Controller
public class UserController {
	
	@Autowired
	userSerivce service;
	
	@RequestMapping(value="/createUser",method=RequestMethod.GET)
	@ResponseBody
	public String createUser(@RequestParam String userId,@RequestParam String userPsd){
		String str="成功";
		User user = new User();
		user.setUserId(userId);
		user.setUserLe(1);
		user.setUserPsd(userPsd);
		service.create(user);
		return str;
	}

}
