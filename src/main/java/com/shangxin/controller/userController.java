package com.shangxin.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.shangxin.bean.Proof;
import com.shangxin.bean.User;
import com.shangxin.serivce.proofSerivce;
import com.shangxin.serivce.userInfoSerivce;
import com.shangxin.serivce.userSerivce;

@Controller
public class userController {
	@Autowired
	userSerivce service;
	@Autowired
	proofSerivce servicep;
	@Autowired
	userInfoSerivce serviceq;
	
	@RequestMapping(value="/selectById",method=RequestMethod.GET)
	@ResponseBody
	public User selectById(@RequestParam String userId){
		return service.selectById(userId);
	}
	
	@RequestMapping(value="/selectAllUser",method=RequestMethod.GET)
	@ResponseBody
	public ModelAndView selectAllUser(){
		ModelAndView mav = new ModelAndView();
		
		List<User> user = service.selectAllUser();
		mav.addObject("UserInfo", user);
		mav.setViewName("userList");
		return mav;
	}
	
	@RequestMapping(value="/deleteUserById",method=RequestMethod.GET)
	@ResponseBody
	public ModelAndView deleteUserById(String userId){
		ModelAndView mav = new ModelAndView();
		service.deleteUserById(userId);
		mav.setViewName("redirect:selectAllUser");
		return mav;
	}
	
	@RequestMapping("/register")
	public ModelAndView createUser(@RequestParam String userId,@RequestParam String userPsd,@RequestParam String proof)throws IOException{
		System.out.println(userId+userPsd+proof);
		User user = new User();
		ModelAndView mav = new ModelAndView();
		Proof prf = servicep.selectByProof(proof);
		User usertest = service.selectById(userId);
		if(null!=prf&&null==usertest&&prf.isUse()){
			user.setUserId(userId);
			user.setUserPsd(userPsd);
			user.setUserLe(prf.getProofLe());
			service.create(user);
			servicep.updateIfUse(prf.getProofId());
			serviceq.inserUserInfo(userId);
			mav.setViewName("redirect:login.jsp");
		}
		else if(null!=usertest){
			mav.addObject("error","此账号已被注册");
			mav.setViewName("register");
		}
		else{
			mav.addObject("error","注册码无效");
			mav.setViewName("register");
		}
		return mav;
	}
	
	@RequestMapping(value="/createUser",method=RequestMethod.GET)
	@ResponseBody
	public String createUser(@RequestParam String userId,@RequestParam String userPsd){
		String str="11111";
		User user = new User();
		user.setUserId(userId);
		user.setUserLe(1);
		user.setUserPsd(userPsd);
		service.create(user);
		return str;
	}
}
