package com.shangxin.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.shangxin.bean.Proof;
import com.shangxin.serivce.proofSerivce;

@Controller
public class proofController {
	
	@Autowired
	proofSerivce service;
	
	@RequestMapping(value="/selectByproof",method=RequestMethod.GET)
	@ResponseBody
	public Proof selectByproof(@RequestParam String proof){
		return service.selectByProof(proof);
	}

	@RequestMapping("selectAllProof")
	public ModelAndView selectAllProof(){
		ModelAndView mav = new ModelAndView();
		List<Proof> list = service.selectAllproof();
		mav.addObject("proofInfo", list);
		mav.setViewName("proofList");
		return mav;
	}
	
	@RequestMapping("doProof")
	public ModelAndView doProof(){
		ModelAndView mav = new ModelAndView();
		String proof =""+(int)((Math.random()*9+1)*10000);
		mav.addObject("proof", proof);
		mav.setViewName("proofForm");
		return mav;
	}
	
	@RequestMapping("insertProof")
	public ModelAndView inserProof(Proof proof){
		ModelAndView mav = new ModelAndView();
		
		Date proofDate = new Date();
		proof.setProofDate(proofDate);
		proof.setUse(true);
		service.insertProof(proof);
		mav.setViewName("redirect:selectAllProof");
		return mav;
	}
	
	@RequestMapping("deleteProof")
	public ModelAndView deleteProof(int proofId){
		ModelAndView mav = new ModelAndView();
		service.deleteProof(proofId);
		mav.addObject("message", "删除成功！");
		mav.setViewName("redirect:selectAllProof");
		return mav;
	}
}
