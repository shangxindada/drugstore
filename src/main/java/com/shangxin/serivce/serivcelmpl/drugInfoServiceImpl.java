package com.shangxin.serivce.serivcelmpl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shangxin.bean.DrugInfo;
import com.shangxin.dao.drugInfoDao;
import com.shangxin.serivce.drugInfoSerivce;

@Service
public class drugInfoServiceImpl implements drugInfoSerivce{
	
	@Autowired
	drugInfoDao dao;

	@Override
	public List<DrugInfo> selectSameDrugInfo(int start, int size) {
		// TODO Auto-generated method stub
		return dao.selectSameDrugInfo(start, size);
	}

	@Override
	public int selectDrugInfoCount() {
		// TODO Auto-generated method stub
		return dao.selectDrugInfoCount();
	}

	@Override
	public void updateByDrugNumber(DrugInfo drugInfo) {
		// TODO Auto-generated method stub
		dao.updateByDrugNumber(drugInfo);
	}

	@Override
	public void insertDrugInfo( DrugInfo drugInfo) {
		// TODO Auto-generated method stub
		dao.insertDrugInfo(drugInfo);
	}

	@Override
	public DrugInfo selectByDrugNumber(String drugNumber) {
		// TODO Auto-generated method stub
		return dao.selectByDrugNumber(drugNumber);
	}

	@Override
	public List<DrugInfo> selectAllDrugInfo() {
		// TODO Auto-generated method stub
		return dao.selectAllDrugInfo();
	}

	@Override
	public void deleteDrugInfoByDrugNumber(String drugNumber) {
		// TODO Auto-generated method stub
		dao.deleteDrugInfoByDrugNumber(drugNumber);
	}

	@Override
	public void updateStockByDrugNumber(int stock, String drugNumber) {
		// TODO Auto-generated method stub
		dao.updateStockByDrugNumber(stock, drugNumber);
	}
	
	
}
