package com.shangxin.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSONArray;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.shangxin.bean.SupplierInfo;
import com.shangxin.serivce.supplierInfoSerivce;


@Controller
public class supplierInfoController {
	
	@Autowired
	supplierInfoSerivce supplierInfoSerivce;
	
	@RequestMapping("/selectSupplierInfo")
	@ResponseBody
	public ModelAndView selectAllSupplierInfo(int pageNum){
		
		PageHelper.startPage(pageNum, 6);
		List<SupplierInfo> list2 = supplierInfoSerivce.selectAllSupplierInfo();
		PageInfo<SupplierInfo> page=new PageInfo<>(list2);
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("supplierInfo", page);
		mav.setViewName("/supplierInfo");
		return mav;
	}
	
	@RequestMapping("/supplierInfoForm")
	@ResponseBody
	public ModelAndView supplierInfoForm(String supplierid,String flag){
		ModelAndView mav = new ModelAndView();
		if(!"".equals(supplierid)){
			if("d".equals(flag)){
				supplierInfoSerivce.deleteSupplierBySupplierId(supplierid);
				mav.setViewName("redirect:/selectSupplierInfo?pageNum=1");
			}
			else{
				SupplierInfo supplierInfo = supplierInfoSerivce.selectSupplierBySupplierId(supplierid);
				mav.addObject("supplierInfo",supplierInfo);
				mav.setViewName("/supplierInfoForm");
			}
		}
		else{
			mav.setViewName("/supplierInfoForm");
		}
		return mav;
	}
	
	public String aa(@RequestBody List<SupplierInfo> list){
		String str = JSONArray.toJSONString(list);
		return str;
	}
	@RequestMapping("doSupplierInfo")
	@ResponseBody
	public ModelAndView doSupplierInfo(String act,SupplierInfo supplierInfo){
		ModelAndView mav=new ModelAndView();
		if("add".equals(act)){
			Date d = new Date();    
		    SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");  
		    String dateNowStr = sdf.format(d);
		    String supplierid = "65"+dateNowStr+(int)((Math.random()*9+1)*100000);
		    supplierInfo.setSupplierId(supplierid);
			supplierInfoSerivce.insertSupplier(supplierInfo);
			mav.addObject("message", "添加成功");
			mav.setViewName("redirect:/selectSupplierInfo?pageNum=1");
		}else{
			supplierInfoSerivce.updateSupplierBySupplierId(supplierInfo);
			mav.addObject("message", "修改成功");
			mav.setViewName("redirect:/selectSupplierInfo?pageNum=1");
		}
		return mav;
	}
}
