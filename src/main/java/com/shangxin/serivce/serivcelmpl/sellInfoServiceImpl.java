package com.shangxin.serivce.serivcelmpl;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shangxin.bean.SellInfo;
import com.shangxin.dao.SellInfoMapper;
import com.shangxin.serivce.sellInfoSerivce;

@Service
public class sellInfoServiceImpl implements sellInfoSerivce {
	
	@Autowired
	SellInfoMapper sellInfoMapper;

	@Override
	public int deleteByPrimaryKey(String sellnumber) {
		// TODO Auto-generated method stub
		return sellInfoMapper.deleteByPrimaryKey(sellnumber);
	}

	@Override
	public int insert(SellInfo record) {
		// TODO Auto-generated method stub
		return sellInfoMapper.insert(record);
	}

	@Override
	public int insertSelective(SellInfo record) {
		// TODO Auto-generated method stub
		return sellInfoMapper.insertSelective(record);
	}

	@Override
	public SellInfo selectByPrimaryKey(String sellnumber) {
		// TODO Auto-generated method stub
		return sellInfoMapper.selectByPrimaryKey(sellnumber);
	}

	@Override
	public int updateByPrimaryKeySelective(SellInfo record) {
		// TODO Auto-generated method stub
		return sellInfoMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(SellInfo record) {
		// TODO Auto-generated method stub
		return sellInfoMapper.updateByPrimaryKey(record);
	}

	@Override
	public float selectAllPrice(String sellId) {
		// TODO Auto-generated method stub
		return sellInfoMapper.selectAllPrice(sellId);
	}

	@Override
	public List<SellInfo> selectBySellId(String sellId) {
		// TODO Auto-generated method stub
		return sellInfoMapper.selectBySellId(sellId);
	}

	@Override
	public int deleteBySellId(String sellId) {
		// TODO Auto-generated method stub
		return sellInfoMapper.deleteBySellId(sellId);
	}

	@Override
	public List<String> selectByDate(Date startDate, Date endDate) {
		// TODO Auto-generated method stub
		return sellInfoMapper.selectByDate(startDate, endDate);
	}

	@Override
	public int selectStock(String drugNumber,Date startDate,Date endDate) {
		// TODO Auto-generated method stub
		return sellInfoMapper.selectStock(drugNumber,startDate,endDate);
	}

}
