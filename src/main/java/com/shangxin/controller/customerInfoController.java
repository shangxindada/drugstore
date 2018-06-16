package com.shangxin.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.shangxin.bean.CustomerInfo;
import com.shangxin.serivce.customerInfoSerivce;

@Controller
public class customerInfoController {
	
	@Autowired
	customerInfoSerivce customerInfoSerivce;
	
	@RequestMapping("/selectCustomerInfo")
	@ResponseBody
	public ModelAndView selectCustomerInfo(int pageNum){
		ModelAndView mav = new ModelAndView();
		
		PageHelper.startPage(pageNum,6);
		List<CustomerInfo> list = customerInfoSerivce.selectAllCustomerInfo();
		PageInfo<CustomerInfo> customerInfo = new PageInfo<>(list);
		
		mav.addObject("customerInfo", customerInfo);
		mav.setViewName("customerInfo");
		return mav;
	}
	
	@RequestMapping("/customerInfoForm")
	@ResponseBody
	public ModelAndView customerInfoForm(String customerNumber,String flag){
		ModelAndView mav = new ModelAndView();
		if(!"".equals(customerNumber)){
			if("d".equals(flag)){
				customerInfoSerivce.deleteByPrimaryKey(customerNumber);
				mav.setViewName("redirect:/selectCustomerInfo?pageNum=1");
			}
			else{
				CustomerInfo customerInfo = customerInfoSerivce.selectByPrimaryKey(customerNumber);
				mav.addObject("customerInfo",customerInfo);
				mav.setViewName("/customerInfoForm");
			}
		}
		else{
			mav.setViewName("/customerInfoForm");
		}
		return mav;
	}
	
	@RequestMapping("doCustomerInfo")
	@ResponseBody
	public ModelAndView doCustomerInfo(String act,CustomerInfo customerInfo){
		ModelAndView mav=new ModelAndView();
		if("add".equals(act)){
			Date d = new Date();    
		    SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");  
		    String dateNowStr = sdf.format(d);
		    String customerid = "66"+dateNowStr+(int)((Math.random()*9+1)*100000);
		    customerInfo.setCustomerid(customerid);
			customerInfoSerivce.insert(customerInfo);
			mav.addObject("message", "添加成功");
			mav.setViewName("redirect:/selectCustomerInfo?pageNum=1");
		}else{
			customerInfoSerivce.updateByPrimaryKey(customerInfo);
			mav.addObject("message", "修改成功");
			mav.setViewName("redirect:/selectCustomerInfo?pageNum=1");
		}
		return mav;
	}

}
