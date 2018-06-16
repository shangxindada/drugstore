package com.shangxin.serivce;

import java.util.List;

import com.shangxin.bean.SupplierInfo;

public interface supplierInfoSerivce {
	public List<SupplierInfo> selectAllSupplierInfo();
	SupplierInfo selectSupplierBySupplierId(String supplierId);
	void deleteSupplierBySupplierId(String supplierId);
	void insertSupplier(SupplierInfo supplierInfo);
	void updateSupplierBySupplierId(SupplierInfo supplierInfo);
}
