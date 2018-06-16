package com.shangxin.serivce;

import java.util.List;

import com.shangxin.bean.DrugInfoAll;

public interface drugInfoAllSerivce {
	List<DrugInfoAll> selectDrugInfoAll();
	List<DrugInfoAll> selectById(String drugNumber);
	List<DrugInfoAll> selectByName(String drugName);
	List<DrugInfoAll> selectByType(String type);
}
