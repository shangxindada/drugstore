package com.shangxin.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.shangxin.bean.User;
import com.shangxin.bean.UserInfo;
import com.shangxin.serivce.userInfoSerivce;

@Controller
public class userInfoController {
	
	@Autowired
	userInfoSerivce service;
	
	@RequestMapping(value="/selectUserInfo",method=RequestMethod.GET)
	@ResponseBody
	public ModelAndView selectByUserId(HttpServletRequest request){
		ModelAndView mav = new ModelAndView();
		User user = (User)request.getSession().getAttribute("currentUser");
		String userId = user.getUserId();
		UserInfo userInfo = service.selectByUserId(userId);
		mav.addObject("userInfo", userInfo);
		mav.setViewName("/userInfo");
		
		return mav;
	}
	
	@RequestMapping(value="/selectAllUserInfo")
	@ResponseBody
	public List<UserInfo> selectAllUserInfo(){
		return service.selectAllUserInfo();
	}
	
	@RequestMapping(value="/insertUserInfo",method=RequestMethod.GET)
	@ResponseBody
	public String insetUserInfo(String userId){
		String str="121";
		service.inserUserInfo(userId);
		return str;
	}
	/*@RequestMapping(value="/updateUserInfo",method=RequestMethod.GET)
	public void updateUserInfo(@RequestParam String userNumber,@RequestParam String userName,@RequestParam String sex,@RequestParam String age,
			@RequestParam String userPhone,@RequestParam String useraddress,@RequestParam String salary,
			@RequestParam String userPostion){
		System.out.println(userName);
		int userNum = Integer.parseInt(userNumber);
		float salarya = Float.parseFloat(salary);
		int agey = Integer.parseInt(age);
		service.updateUserInfo(userName, sex, agey, userPhone, useraddress, salarya, userPostion, userNum);
	}*/
	@RequestMapping("/updateUserInfo")
	public ModelAndView updateUserInfo(@Param("userName") String userName,@Param("sex") String sex,@Param("age") String age,
			@Param("userPhone") String userPhone,@Param("useraddress") String useraddress,@Param("salary") String salary,
			@Param("userPostion") String userPostion,@Param("userNumber") String userNumber){
		System.out.println(userName);
		ModelAndView mav = new ModelAndView();
		int userNum = Integer.parseInt(userNumber);
		float salarya = Float.parseFloat(salary);
		int agey = Integer.parseInt(age);
		UserInfo userInfo = new UserInfo();
		userInfo.setAge(agey);
		userInfo.setSalary(salarya);
		userInfo.setSex(sex);
		userInfo.setUseraddress(useraddress);
		userInfo.setUserName(userName);
		userInfo.setUserNumber(userNum);
		userInfo.setUserPostion(userPostion);
		userInfo.setUserPhone(userPhone);
		service.updateUserInfo(userInfo);
		mav.setViewName("redirect:/selectUserInfo");
		mav.addObject("massage","修改成功");
		return mav;
	}
	
	
}
