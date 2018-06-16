package com.shangxin.controller;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.shangxin.bean.DrugInfo;
import com.shangxin.bean.SearchInfo;
import com.shangxin.serivce.drugInfoSerivce;
import com.shangxin.serivce.sellInfoSerivce;
import com.shangxin.serivce.warehousingInfoSerivce;

@Controller
public class from {
	
	@Autowired
	sellInfoSerivce sellInfoService;
	@Autowired
	warehousingInfoSerivce warehousingInfoSerivce;
	@Autowired
	drugInfoSerivce  drugInfoSerivce;
	
	@SuppressWarnings("null")
	@RequestMapping("serchFrom")
	@ResponseBody
	public ModelAndView serchFrom(Date startDate,Date endDate,String type){
		ModelAndView mav= new ModelAndView();
		if(type.equals("a")){
			List<SearchInfo> searchInfo = new ArrayList<>();
			if(startDate.before(endDate)){
				List<String> sellInfo = sellInfoService.selectByDate(startDate, endDate);
				for(int i = 0;i < sellInfo.size();i++){
					DrugInfo drugInfo = drugInfoSerivce.selectByDrugNumber(sellInfo.get(i).intern());
					if(null!=drugInfo){
					SearchInfo search = new SearchInfo();
					search.setDrugName(drugInfo.getDrugName());
					search.setDrugNumber(drugInfo.getDrugNumber());
					search.setStock(drugInfo.getStock());
					search.setSellStock(sellInfoService.selectStock(drugInfo.drugNumber,startDate, endDate));
					searchInfo.add(i, search);
					}
				}
			}else{
				List<String> sellInfo = sellInfoService.selectByDate(endDate,startDate);
				for(int i = 0;i < sellInfo.size();i++){
					DrugInfo drugInfo = drugInfoSerivce.selectByDrugNumber(sellInfo.get(i).intern());
					if(null!=drugInfo){
					SearchInfo search = new SearchInfo();
					search.setDrugName(drugInfo.getDrugName());
					search.setDrugNumber(drugInfo.getDrugNumber());
					search.setStock(drugInfo.getStock());
					search.setSellStock(sellInfoService.selectStock(drugInfo.drugNumber,startDate, endDate));
					searchInfo.add(i, search);
					}
				}
			}
			mav.addObject("sellInfo", searchInfo);
			mav.setViewName("serchSellInfo");
		}
		else{
			List<SearchInfo> searchInfo = new ArrayList<>();
			if(startDate.before(endDate)){
				List<String> warehousingInfo = warehousingInfoSerivce.selectByDate(startDate, endDate);
				for(int i = 0;i < warehousingInfo.size();i++){
					DrugInfo drugInfo = drugInfoSerivce.selectByDrugNumber(warehousingInfo.get(i).intern());
					SearchInfo search=new SearchInfo();
					search.setDrugName(drugInfo.getDrugName());
					search.setDrugNumber(drugInfo.getDrugNumber());
					search.setStock(drugInfo.getStock());
					search.setSellStock(warehousingInfoSerivce.selectStock(drugInfo.drugNumber,startDate, endDate));
					searchInfo.add(i, search);
				}
			}else{
				List<String> warehousingInfo = warehousingInfoSerivce.selectByDate(endDate,startDate);
				for(int i = 0;i < warehousingInfo.size();i++){
					DrugInfo drugInfo = drugInfoSerivce.selectByDrugNumber(warehousingInfo.get(i).intern());
					SearchInfo search = null;
					search.setDrugName(drugInfo.drugName);
					search.setDrugNumber(drugInfo.drugNumber);
					search.setStock(drugInfo.stock);
					search.setSellStock(warehousingInfoSerivce.selectStock(drugInfo.drugNumber,startDate, endDate));
					searchInfo.add(i, search);
				}
			}
			mav.addObject("warehousingInfo", searchInfo);
			mav.setViewName("wareInfo");
		}
		return mav;
	}

}
