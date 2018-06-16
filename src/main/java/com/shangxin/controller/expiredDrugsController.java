package com.shangxin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.shangxin.bean.ExpiredDrugs;
import com.shangxin.dao.ExpiredDrugsMapper;
import com.shangxin.dao.drugInfoDao;

@Controller
public class expiredDrugsController {
	
	@Autowired
	ExpiredDrugsMapper ExpiredDrugsMapper;
	@Autowired
	drugInfoDao drugInfoDao;
	
	@RequestMapping("selectAllExpired")
	@ResponseBody
	public ModelAndView selectAllExpired(int num){
		ModelAndView mav = new ModelAndView();
		
		PageHelper.startPage(num,6);
		List<ExpiredDrugs> list = ExpiredDrugsMapper.selectAll();
		PageInfo<ExpiredDrugs> ExpiredDrugs = new PageInfo<>(list);
		
		mav.addObject("expiredDrugs", ExpiredDrugs);
		mav.setViewName("expiredList");
		return mav;
	}
	
	@RequestMapping("deleteExpired")
	@ResponseBody
	public ModelAndView deleteExpired(int expnumber){
		ModelAndView mav = new ModelAndView();
		ExpiredDrugsMapper.deleteByPrimaryKey(expnumber);
		mav.setViewName("redirect:/selectAllExpired?num=1");
		return mav;
	}
	
	@RequestMapping("insertExpired")
	public ModelAndView insertExpired(ExpiredDrugs expiredDrugs){
		ModelAndView mav = new ModelAndView();
		int stock =drugInfoDao.selectByDrugNumber(expiredDrugs.getDrugnumber()).getStock();
		stock+=expiredDrugs.getExpnum();
		drugInfoDao.updateStockByDrugNumber(stock, expiredDrugs.getDrugnumber());
		ExpiredDrugsMapper.insertSelective(expiredDrugs);
		mav.addObject("message", "信息保存成功！");
		mav.setViewName("expiredForm");
		return mav;
	}

}
