package com.shangxin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.shangxin.bean.DrugInfo;
import com.shangxin.bean.WarehousingInfo;
import com.shangxin.serivce.drugInfoSerivce;
import com.shangxin.serivce.warehousingInfoSerivce;;

@Controller
public class warehousingInfoController {
	
	@Autowired
	warehousingInfoSerivce warehousingInfoSerivce; 
	@Autowired
	drugInfoSerivce drugInfoSerivce;
	
	@RequestMapping("/insertWarehousingInfo")
	@ResponseBody
	public ModelAndView insertWarehousingInfo(WarehousingInfo warehousing){
		ModelAndView mav = new ModelAndView();
		DrugInfo drugInfo = drugInfoSerivce.selectByDrugNumber(warehousing.getDrugnumber());
		if(null!=drugInfo){
		warehousingInfoSerivce.insert(warehousing);
		mav.addObject("message", "上一条信息保存成功");
		}else{
			mav.addObject("message", "上一条信息无效未保存");
		}
		mav.setViewName("purchaseForm");
		return mav;
	}
	
	@RequestMapping("/purchaseInfo")
	@ResponseBody
	public ModelAndView selectPurchaseInfo(int pageNum){
		PageHelper.startPage(pageNum, 6);
		List<WarehousingInfo> list2 = warehousingInfoSerivce.selectWarehousingInfo();
		PageInfo<WarehousingInfo> page=new PageInfo<>(list2);
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("warehousingInfo", page);
		mav.setViewName("purchaseInfoList");
		return mav;
	}
	
	@RequestMapping("/deletePurchase")
	@ResponseBody
	public ModelAndView deletePurchase(int warehousingid){
		warehousingInfoSerivce.deleteByPrimaryKey(warehousingid);
		ModelAndView mav = new ModelAndView();
		mav.addObject("message","删除成功");
		mav.setViewName("redirect:/purchaseInfo?pageNum=1");
		return mav;
	}
	
	@RequestMapping("/isPurchase")
	@ResponseBody
	public ModelAndView updatePurchaseMark(int warehousingid){
		WarehousingInfo warehousing = new WarehousingInfo();
		warehousing.setWarehousingid(warehousingid);
		warehousing.setMark(1);
		WarehousingInfo warehousingInfo = warehousingInfoSerivce.selectByPrimaryKey(warehousingid);
		String drugNumber = warehousingInfo.getDrugnumber();
		DrugInfo drugInfo = drugInfoSerivce.selectByDrugNumber(drugNumber);
		int stock = drugInfo.getStock()+warehousingInfo.getStock();
		drugInfoSerivce.updateStockByDrugNumber(stock, drugNumber);
		warehousing.setStock(warehousingInfo.getStock());
		warehousingInfoSerivce.updateByPrimaryKeySelective(warehousing);
		ModelAndView mav = new ModelAndView();
		mav.addObject("message","入库成功");
		mav.setViewName("redirect:/purchaseInfo?pageNum=1");
		return mav;
	}

}
