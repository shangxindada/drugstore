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
import com.shangxin.bean.OtherSellInfo;
import com.shangxin.bean.SellInfo;
import com.shangxin.serivce.drugInfoSerivce;
import com.shangxin.serivce.otherSellInfoSerivce;
import com.shangxin.serivce.sellInfoSerivce;

@Controller
public class sellInfoController {
	
	@Autowired
	sellInfoSerivce sellInfoService;
	@Autowired
	otherSellInfoSerivce otherSellInfoService;
	@Autowired
	drugInfoSerivce drugInfoService; 
	
	@RequestMapping("/sellForm")
	@ResponseBody 
	public ModelAndView getSellId(){
		Date d = new Date();    
	    SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");  
	    String dateNowStr = sdf.format(d);
		String sellId = "81"+dateNowStr+(int)((Math.random()*9+1)*1000);
	
		ModelAndView mav = new ModelAndView();
		mav.addObject("sellId", sellId);
		mav.addObject("number", 1);
		mav.setViewName("sellInfoForm");
		return mav;
	}
	
	@RequestMapping("/insertSellInfo")
	@ResponseBody
	public ModelAndView InsertSellInfo(String sellId,SellInfo sellInfo,Integer number){
		ModelAndView mav = new ModelAndView();
		if(number<10){
			sellInfo.setSellnumber(sellId+"0"+number);
		}else{
			sellInfo.setSellnumber(sellId+number);
		}
		sellInfo.setSellid(sellId);
		int stock = drugInfoService.selectByDrugNumber(sellInfo.getDrugnumber()).getStock()-sellInfo.getSellnum();
		if(stock<0){
			mav.addObject("message","库存不足，请重新输入数量！");
			mav.addObject("number", number);
		}else{
			sellInfoService.insert(sellInfo);
			drugInfoService.updateStockByDrugNumber(stock, sellInfo.getDrugnumber());
			mav.addObject("number", number+1);
		}
		mav.addObject("sellId", sellId);
		mav.setViewName("sellInfoForm");
		return mav;
	}
	

	
	@RequestMapping("/insertOtherSellInfo")
	@ResponseBody
	public ModelAndView InsertOtherSellInfo(String sellId,SellInfo sellInfo,Integer number,String userId){
		ModelAndView mav = new ModelAndView();
		if(number<10){
			sellInfo.setSellnumber(sellId+"0"+number);
		}else{
			sellInfo.setSellnumber(sellId+number);
		}
		sellInfo.setSellid(sellId);
		int stock = drugInfoService.selectByDrugNumber(sellInfo.getDrugnumber()).getStock()-sellInfo.getSellnum();
		if(stock<0){
			mav.addObject("message","库存不足，请重新输入数量！");
		}else{
			sellInfoService.insert(sellInfo);
			drugInfoService.updateStockByDrugNumber(stock, sellInfo.getDrugnumber());
		}
		
		OtherSellInfo otherSellInfo = new OtherSellInfo();
		otherSellInfo.setSellid(sellId);
		Date d = new Date();
		otherSellInfo.setSelldata(d);
		otherSellInfo.setUserid(userId);
		float allprice = sellInfoService.selectAllPrice(sellId);
		otherSellInfo.setAllprice(allprice);
		
		otherSellInfoService.insert(otherSellInfo);
		List<SellInfo> list = sellInfoService.selectBySellId(sellId);
		OtherSellInfo oterSellInfoh = otherSellInfoService.selectByPrimaryKey(sellId);
		mav.addObject("sellInfo", list);
		mav.addObject("otherSellInfo", oterSellInfoh);
		mav.addObject("type",1);
		mav.setViewName("/otherSellInfo");
		return mav;
	}
	
	@RequestMapping("selectOtherSellInfo")
	@ResponseBody
	public ModelAndView selectOtherSellInfo(int pageNum){
		PageHelper.startPage(pageNum,6);
		List<OtherSellInfo> list2 = otherSellInfoService.selectOtherSellInfo();
		PageInfo<OtherSellInfo> page=new PageInfo<>(list2);
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("otherSellInfo",page);
		mav.setViewName("/otherSellList");
		
		return mav;
	}
	
	@RequestMapping("selectOtherSell")
	@ResponseBody
	public ModelAndView selectOtherSell(String sellid){
		List<SellInfo> list = sellInfoService.selectBySellId(sellid);
		OtherSellInfo oterSellInfoh = otherSellInfoService.selectByPrimaryKey(sellid);
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("sellInfo", list);
		mav.addObject("otherSellInfo", oterSellInfoh);
		mav.addObject("type",0);
		mav.setViewName("/otherSellInfo");
		return mav;
	}
	
	@RequestMapping("deleteOtherSell")
	@ResponseBody
	public ModelAndView deleteOtherSell(String sellid){
		sellInfoService.deleteBySellId(sellid);
		otherSellInfoService.deleteByPrimaryKey(sellid);
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("message","删除成功！");
		mav.setViewName("redirect:/selectOtherSellInfo?pageNum=1");
		return mav;
	}
}
