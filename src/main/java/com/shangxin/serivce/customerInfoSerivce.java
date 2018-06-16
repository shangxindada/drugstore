package com.shangxin.serivce;

import java.util.List;

import com.shangxin.bean.CustomerInfo;

public interface customerInfoSerivce {
	int deleteByPrimaryKey(String customerid);

    int insert(CustomerInfo record);

    int insertSelective(CustomerInfo record);

    CustomerInfo selectByPrimaryKey(String customerid);

    int updateByPrimaryKeySelective(CustomerInfo record);

    int updateByPrimaryKey(CustomerInfo record);
    
    List<CustomerInfo> selectAllCustomerInfo();
}
