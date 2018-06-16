package com.shangxin.serivce;

import java.util.List;

import com.shangxin.bean.DrugType;

public interface drugTypeSerivce {
	public List<DrugType> selectAllDrugType();
	public void insertDrugType(String type);
	public DrugType selectByDrugTypeId(int typeId);
	public void deleteByDrugTypeId(int typeId);
	public void updateByDrugTypeId(int typeId,String type);
}
