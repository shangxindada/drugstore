package com.shangxin.dao;

import java.util.List;

import com.shangxin.bean.DrugInfoAll;

public interface drugInfoAllDao {
	List<DrugInfoAll> selectDrugInfoAll();
	List<DrugInfoAll> selectById(String drugNumber);
	List<DrugInfoAll> selectByName(String drugName);
	List<DrugInfoAll> selectByType(String type);
}
