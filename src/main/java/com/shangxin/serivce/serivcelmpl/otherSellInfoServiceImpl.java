package com.shangxin.serivce.serivcelmpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shangxin.bean.OtherSellInfo;
import com.shangxin.dao.OtherSellInfoMapper;
import com.shangxin.serivce.otherSellInfoSerivce;

@Service
public class otherSellInfoServiceImpl implements otherSellInfoSerivce {

	@Autowired
	OtherSellInfoMapper OtherSellInfoMapper;
	
	@Override
	public int deleteByPrimaryKey(String sellid) {
		// TODO Auto-generated method stub
		return OtherSellInfoMapper.deleteByPrimaryKey(sellid);
	}

	@Override
	public int insert(OtherSellInfo record) {
		// TODO Auto-generated method stub
		return OtherSellInfoMapper.insert(record);
	}

	@Override
	public int insertSelective(OtherSellInfo record) {
		// TODO Auto-generated method stub
		return OtherSellInfoMapper.insertSelective(record);
	}

	@Override
	public OtherSellInfo selectByPrimaryKey(String sellid) {
		// TODO Auto-generated method stub
		return OtherSellInfoMapper.selectByPrimaryKey(sellid);
	}

	@Override
	public int updateByPrimaryKeySelective(OtherSellInfo record) {
		// TODO Auto-generated method stub
		return OtherSellInfoMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(OtherSellInfo record) {
		// TODO Auto-generated method stub
		return OtherSellInfoMapper.updateByPrimaryKey(record);
	}

	@Override
	public List<OtherSellInfo> selectOtherSellInfo() {
		// TODO Auto-generated method stub
		return OtherSellInfoMapper.selectOtherSellInfo();
	}

}
