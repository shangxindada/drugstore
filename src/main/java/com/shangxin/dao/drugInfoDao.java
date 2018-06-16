package com.shangxin.dao;


import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.shangxin.bean.DrugInfo;

public interface drugInfoDao {
	public List<DrugInfo> selectSameDrugInfo(@Param("start") int start,@Param("size") int size);
	public int selectDrugInfoCount();
//	public void updateByDrugNumber(String drugName,Date productDate,String safeDate,String supplierId,float price,float purchasePrice,int stock,int typeId,String remakes,String drugNumber);
//	public void insertDrugInfo(@Param("drugName") String drugName,@Param("productDate") Date productDate,@Param("safeDate") String safeDate,String supplierId,float price,float purchasePrice,int stock,int typeId,String remakes);
	public void insertDrugInfo(DrugInfo drugInfo);
	public void updateByDrugNumber(DrugInfo drugInfo);
	public DrugInfo selectByDrugNumber(String drugNumber);
	public List<DrugInfo> selectAllDrugInfo();
	void deleteDrugInfoByDrugNumber(String drugNumber);
	void updateStockByDrugNumber(@Param("stock")int stock,@Param("drugNumber") String drugNumber);
}
