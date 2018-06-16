package com.shangxin.serivce.serivcelmpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shangxin.bean.DrugType;
import com.shangxin.dao.drugTypeDao;
import com.shangxin.serivce.drugTypeSerivce;

@Service
public class drugTypeServiceImpl implements drugTypeSerivce {
	
	@Autowired
	drugTypeDao dao;

	@Override
	public List<DrugType> selectAllDrugType() {
		// TODO Auto-generated method stub
		return dao.selectAllDrugType();
	}

	@Override
	public void insertDrugType(String type) {
		// TODO Auto-generated method stub
		dao.insertDrugType(type);
	}

	@Override
	public DrugType selectByDrugTypeId(int typeId) {
		// TODO Auto-generated method stub
		return dao.selectByDrugTypeId(typeId);
	}

	@Override
	public void deleteByDrugTypeId(int typeId) {
		// TODO Auto-generated method stub
		dao.deleteByDrugTypeId(typeId);
	}

	@Override
	public void updateByDrugTypeId(int typeId, String type) {
		// TODO Auto-generated method stub
		dao.updateByDrugTypeId( type,typeId);
	}

}
