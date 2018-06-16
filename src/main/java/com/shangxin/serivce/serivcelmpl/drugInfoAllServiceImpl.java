package com.shangxin.serivce.serivcelmpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shangxin.bean.DrugInfoAll;
import com.shangxin.dao.drugInfoAllDao;
import com.shangxin.serivce.drugInfoAllSerivce;

@Service
public class drugInfoAllServiceImpl implements drugInfoAllSerivce {

	@Autowired
	drugInfoAllDao drugInfoAllDao;
	
	@Override
	public List<DrugInfoAll> selectDrugInfoAll() {
		// TODO Auto-generated method stub
		return drugInfoAllDao.selectDrugInfoAll();
	}

	@Override
	public List<DrugInfoAll> selectById(String drugNumber) {
		// TODO Auto-generated method stub
		return drugInfoAllDao.selectById(drugNumber);
	}

	@Override
	public List<DrugInfoAll> selectByName(String drugName) {
		// TODO Auto-generated method stub
		return drugInfoAllDao.selectByName(drugName);
	}

	@Override
	public List<DrugInfoAll> selectByType(String type) {
		// TODO Auto-generated method stub
		return drugInfoAllDao.selectByType(type);
	}

}
