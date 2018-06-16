package com.shangxin.serivce.serivcelmpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shangxin.bean.CustomerInfo;
import com.shangxin.dao.CustomerInfoMapper;
import com.shangxin.serivce.customerInfoSerivce;

@Service
public class customerInfoServiceImpl implements customerInfoSerivce {
	
	@Autowired
	CustomerInfoMapper  CustomerInfoMapper; 
	
	@Override
	public int deleteByPrimaryKey(String customerid) {
		// TODO Auto-generated method stub
		return CustomerInfoMapper.deleteByPrimaryKey(customerid);
	}

	@Override
	public int insert(CustomerInfo record) {
		// TODO Auto-generated method stub
		return CustomerInfoMapper.insert(record);
	}

	@Override
	public int insertSelective(CustomerInfo record) {
		// TODO Auto-generated method stub
		return CustomerInfoMapper.insertSelective(record);
	}

	@Override
	public CustomerInfo selectByPrimaryKey(String customerid) {
		// TODO Auto-generated method stub
		return CustomerInfoMapper.selectByPrimaryKey(customerid);
	}

	@Override
	public int updateByPrimaryKeySelective(CustomerInfo record) {
		// TODO Auto-generated method stub
		return CustomerInfoMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(CustomerInfo record) {
		// TODO Auto-generated method stub
		return CustomerInfoMapper.updateByPrimaryKey(record);
	}

	@Override
	public List<CustomerInfo> selectAllCustomerInfo() {
		// TODO Auto-generated method stub
		return CustomerInfoMapper.selectAllCustomerInfo();
	}

}
