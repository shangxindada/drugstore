package com.shangxin.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.shangxin.bean.User;
import com.shangxin.serivce.userSerivce;

@Controller
public class loginController {
	
	@Autowired
	userSerivce service;
	@RequestMapping("/login")
	public ModelAndView login(String userId,String userPsd,HttpServletRequest request)throws IOException{
		User user = service.selectById(userId);
		 ModelAndView mav = new ModelAndView();
		if(null!=user&&userPsd.equals(user.getUserPsd())){
			request.getSession().setAttribute("userName", user.getUserId());
			request.getSession().setAttribute("leve",user.getUserLe());
			request.getSession().setAttribute("currentUser", user);
			mav.setViewName("redirect:/");
		}else{
			mav.addObject("error", "用户名或者密码错误!请重试！");
			
			mav.setViewName("login");
		}
		return mav;
	}
	
	@RequestMapping("/{page}")
	public ModelAndView transition(String page){
		ModelAndView mav = new ModelAndView();
		mav.setViewName(page);
		return mav;
	}
	
	@RequestMapping(path={"/","/index"})
	public ModelAndView index(HttpServletRequest request)throws IOException{
		 ModelAndView mav = new ModelAndView();
		mav.setViewName("index");
		return mav;
	}
}
