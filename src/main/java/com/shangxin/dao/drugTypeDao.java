package com.shangxin.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.shangxin.bean.DrugType;

public interface drugTypeDao {
	public List<DrugType> selectAllDrugType();
	public void insertDrugType(String type);
	public DrugType selectByDrugTypeId(int typeId);
	public void deleteByDrugTypeId(int typeId);
	public void updateByDrugTypeId(@Param("type") String type,@Param("typeId") int typeId);
}
