package com.shangxin.serivce;


import java.util.List;

import com.shangxin.bean.DrugInfo;

public interface drugInfoSerivce {
	public List<DrugInfo> selectSameDrugInfo(int start,int size);
	public int selectDrugInfoCount();
//	public void updateByDrugNumber(String drugName,Date productDate,String safeDate,String supplierId,float price,float purchasePrice,int stock,int typeId,String remakes,String drugNumber);
//	public void insertDrugInfo(String drugName,Date productDate,String safeDate,String supplierId,float price,float purchasePrice,int stock,int typeId,String remakes);
	public void insertDrugInfo(DrugInfo drugInfo);
	public void updateByDrugNumber(DrugInfo drugInfo);
	public DrugInfo selectByDrugNumber(String drugNumber);
	public List<DrugInfo> selectAllDrugInfo();
	void deleteDrugInfoByDrugNumber(String drugNumber);
	void updateStockByDrugNumber(int stock,String drugNumber);
}
