package com.shangxin.serivce.serivcelmpl;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shangxin.bean.WarehousingInfo;
import com.shangxin.dao.WarehousingInfoMapper;
import com.shangxin.serivce.warehousingInfoSerivce;

@Service
public class warehousingInfoServiceImpl implements warehousingInfoSerivce {
	
	@Autowired
	WarehousingInfoMapper WarehousingInfoMapper;

	@Override
	public int deleteByPrimaryKey(Integer warehousingid) {
		// TODO Auto-generated method stub
		return WarehousingInfoMapper.deleteByPrimaryKey(warehousingid);
	}

	@Override
	public int insert(WarehousingInfo record) {
		// TODO Auto-generated method stub
		return WarehousingInfoMapper.insert(record);
	}

	@Override
	public int insertSelective(WarehousingInfo record) {
		// TODO Auto-generated method stub
		return WarehousingInfoMapper.insertSelective(record);
	}

	@Override
	public WarehousingInfo selectByPrimaryKey(Integer warehousingid) {
		// TODO Auto-generated method stub
		return WarehousingInfoMapper.selectByPrimaryKey(warehousingid);
	}

	@Override
	public List<WarehousingInfo> selectWarehousingInfo() {
		// TODO Auto-generated method stub
		return WarehousingInfoMapper.selectWarehousingInfo();
	}

	@Override
	public int updateByPrimaryKeySelective(WarehousingInfo record) {
		// TODO Auto-generated method stub
		return WarehousingInfoMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(WarehousingInfo record) {
		// TODO Auto-generated method stub
		return WarehousingInfoMapper.updateByPrimaryKey(record);
	}

	@Override
	public List<String> selectByDate(Date startDate, Date endDate) {
		// TODO Auto-generated method stub
		return WarehousingInfoMapper.selectByDate(startDate, endDate);
	}

	@Override
	public int selectStock(String drugNumber,Date startDate,Date endDate) {
		// TODO Auto-generated method stub
		return WarehousingInfoMapper.selectStock(drugNumber,startDate,endDate);
	}

}
