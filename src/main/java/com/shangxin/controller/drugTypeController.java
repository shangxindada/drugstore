package com.shangxin.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.shangxin.bean.DrugType;
import com.shangxin.serivce.drugTypeSerivce;

@Controller
public class drugTypeController {
	@Autowired
	drugTypeSerivce service;
	
	@RequestMapping(value="/selectAllDrugType",method=RequestMethod.GET)
	@ResponseBody
	public ModelAndView selectAllDrugType(int pageNum){
		ModelAndView mav = new ModelAndView();
		
		PageHelper.startPage(pageNum, 6);
		List<DrugType> list = service.selectAllDrugType();
		PageInfo<DrugType> drugType = new PageInfo<>(list);
		
		mav.addObject("drugType", drugType);
		mav.setViewName("goodsTypeList");
		return mav;
	}
	
	@RequestMapping(value="/insertDrugType")
	@ResponseBody
	public ModelAndView insertDrugType(String act, String typeId,String type){
		ModelAndView mav = new ModelAndView();
		if("add".equals(act)){
			service.insertDrugType(type);
			mav.addObject("message", "添加成功");
			mav.setViewName("redirect:/selectAllDrugType?pageNum=1");
		}
		else{
			int id = Integer.parseInt(typeId);
			service.updateByDrugTypeId(id, type);
			mav.addObject("message", "修改成功");
			mav.setViewName("redirect:/selectAllDrugType?pageNum=1");
		}
		return mav;
	}
	
	@RequestMapping(value="/drugTypeForm")
	@ResponseBody
	public ModelAndView drugTypeForm(String id,String flag){
		ModelAndView mav = new ModelAndView();
		if(!"".equals(id)){
			int typeId = Integer.parseInt(id);
			if("d".equals(flag)){
				service.deleteByDrugTypeId(typeId);
				mav.setViewName("redirect:/selectAllDrugType?pageNum=1");
			}
			else{
				DrugType type = service.selectByDrugTypeId(typeId);
				mav.addObject("type", type);
				mav.setViewName("/goodsTypeForm");
			}
		}
		else{
			mav.setViewName("/goodsTypeForm");
		}
		return mav;
	}
}
