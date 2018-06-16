package com.shangxin.serivce.serivcelmpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shangxin.bean.SupplierInfo;
import com.shangxin.dao.supplierInfoDao;
import com.shangxin.serivce.supplierInfoSerivce;

@Service
public class supplierInfoServiceImpl implements supplierInfoSerivce{

	@Autowired
	supplierInfoDao dao;
	
	@Override
	public List<SupplierInfo> selectAllSupplierInfo() {
		// TODO Auto-generated method stub
		return dao.selectAllSupplierInfo();
	}

	@Override
	public SupplierInfo selectSupplierBySupplierId(String supplierId) {
		// TODO Auto-generated method stub
		return dao.selectSupplierBySupplierId(supplierId);
	}

	@Override
	public void deleteSupplierBySupplierId(String supplierId) {
		// TODO Auto-generated method stub
		dao.deleteSupplierBySupplierId(supplierId);
	}

	@Override
	public void insertSupplier(SupplierInfo supplierInfo) {
		// TODO Auto-generated method stub
		dao.insertSupplier(supplierInfo);
	}

	@Override
	public void updateSupplierBySupplierId(SupplierInfo supplierInfo) {
		// TODO Auto-generated method stub
		dao.updateSupplierBySupplierId(supplierInfo);
	}
	
	
}
