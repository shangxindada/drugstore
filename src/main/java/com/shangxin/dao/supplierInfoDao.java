package com.shangxin.dao;

import java.util.List;

import com.shangxin.bean.SupplierInfo;

public interface supplierInfoDao {
	public List<SupplierInfo> selectAllSupplierInfo();
	SupplierInfo selectSupplierBySupplierId(String supplierId);
	void deleteSupplierBySupplierId(String supplierId);
	void insertSupplier(SupplierInfo supplierInfo);
	void updateSupplierBySupplierId(SupplierInfo supplierInfo);
}
