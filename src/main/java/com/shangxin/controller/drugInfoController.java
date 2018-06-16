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
import com.shangxin.bean.DrugInfo;
import com.shangxin.bean.DrugInfoAll;
import com.shangxin.serivce.drugInfoAllSerivce;
import com.shangxin.serivce.drugInfoSerivce;

@Controller
public class drugInfoController {
	
	@Autowired
	drugInfoSerivce  drugInfoSerivce;
	
	@Autowired
	drugInfoAllSerivce drugInfoAllSerivce;
	
	@RequestMapping("selectSameDrugInfo")
	@ResponseBody
	public PageInfo<DrugInfo> selectSameDrugInfo(String start,String size){
		int start1 = Integer.parseInt(start);
		int size1 = Integer.parseInt(size);
		
		PageHelper.startPage(start1, size1);
		List<DrugInfo> list = drugInfoSerivce.selectAllDrugInfo();
		PageInfo<DrugInfo> pageInfo=new PageInfo<>(list);
		
		return pageInfo;
	}
	
	@RequestMapping("selectDrugInfoAll")
	@ResponseBody
	public ModelAndView selectDrugInfoAll(int pageNum){
//		int start1 = Integer.parseInt(start);
//		int size1 = Integer.parseInt(size);
		PageHelper.startPage(pageNum, 6);
		List<DrugInfoAll> list2 = drugInfoAllSerivce.selectDrugInfoAll();
		PageInfo<DrugInfoAll> page=new PageInfo<>(list2);
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("drugInfo",page);
		mav.setViewName("/goodsList");
		
		return mav;
	}
	
	@RequestMapping("selectByDrugNumber")
	@ResponseBody
	public DrugInfo selectDrugInfoByDrugNumber(String drugNumber){
		return drugInfoSerivce.selectByDrugNumber(drugNumber);
	}
	
	@RequestMapping("drugInfoForm")
	@ResponseBody
	public ModelAndView drugInfoForm(String drugNumber,String flag){
		ModelAndView mav=new ModelAndView();
		if(!"".equals(drugNumber)){
			if("d".equals(flag)){
				drugInfoSerivce.deleteDrugInfoByDrugNumber(drugNumber);
				mav.setViewName("redirect:/selectDrugInfoAll?pagNum=1");
			}
			else{
				DrugInfo drugInfo = drugInfoSerivce.selectByDrugNumber(drugNumber);
				mav.addObject("drugInfo",drugInfo);
				mav.setViewName("/goodsForm");
			}
		}
		else{
			mav.setViewName("/goodsForm");
		}
		return mav;
	}
	
	/*@RequestMapping("doDrugInfo")
	@ResponseBody
	public ModelAndView doDrugInfo(String act,String drugNumber,String drugName,Date productDate,String safeDate,String supplierId,float price,float purchasePrice,int stock,int typeId,String remakes){
		ModelAndView mav=new ModelAndView();
		if("add".equals(act)){
			drugInfoSerivce.insertDrugInfo( drugName, productDate, safeDate, supplierId, price, purchasePrice, stock, typeId, remakes);
			mav.addObject("message", "添加成功");
			mav.setViewName("redirect:/selectDrugInfoAll?pageNum=1");
		}else{
			drugInfoSerivce.updateByDrugNumber(drugName, productDate, safeDate, supplierId, price, purchasePrice, stock, typeId, remakes, drugNumber);
			mav.addObject("message", "修改成功");
			mav.setViewName("redirect:/selectDrugInfoAll?pageNum=1");
		}
		return mav;
	}*/
	@RequestMapping("doDrugInfo")
	@ResponseBody
	public ModelAndView doDrugInfo(String act,DrugInfo drugInfo){
		ModelAndView mav=new ModelAndView();
		if("add".equals(act)){
			Date d = new Date();    
		    SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");  
		    String dateNowStr = sdf.format(d);
		    String drugNum = "88"+dateNowStr+(int)((Math.random()*9+1)*100000);
		    drugInfo.setDrugNumber(drugNum);
		    drugInfo.setStock(0);
			drugInfoSerivce.insertDrugInfo( drugInfo);
			mav.addObject("message", "添加成功");
			mav.setViewName("redirect:/selectDrugInfoAll?pageNum=1");
		}else{
			drugInfoSerivce.updateByDrugNumber(drugInfo);
			mav.addObject("message", "修改成功");
			mav.setViewName("redirect:/selectDrugInfoAll?pageNum=1");
		}
		return mav;
	}
	
	@RequestMapping("searchDrugInfo")
	@ResponseBody
	public ModelAndView searchDrugInfo(String type,String value){
		ModelAndView mav = new ModelAndView();
		if(type.equals("a")){
			List<DrugInfoAll> drugInfo = drugInfoAllSerivce.selectByType(value);
			System.out.println(drugInfo);
			if(null!=drugInfo){
				mav.addObject("drugInfo", drugInfo);
			}
			else{
				mav.addObject("message", "未查询到信息！");
			}
		}else if(type.equals("b")){
			List<DrugInfoAll> drugInfo = drugInfoAllSerivce.selectByName(value);
			if(null!=drugInfo){
				mav.addObject("drugInfo", drugInfo);
			}
			else{
				mav.addObject("message", "未查询到信息！");
			}
		}else{
			List<DrugInfoAll> drugInfo = drugInfoAllSerivce.selectById(value);
			System.out.println(drugInfo);
			if(null!=drugInfo){
				mav.addObject("drugInfo", drugInfo);
			}
			else{
				mav.addObject("message", "未查询到信息！");
			}
		}
		mav.setViewName("/drugList");
		
		return mav;
	}
}
