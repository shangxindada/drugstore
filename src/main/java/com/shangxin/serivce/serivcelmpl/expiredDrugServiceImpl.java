package com.shangxin.serivce.serivcelmpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shangxin.bean.ExpiredDrugs;
import com.shangxin.serivce.expiredDrugSerivce;
import com.shangxin.dao.ExpiredDrugsMapper;

@Service
public class expiredDrugServiceImpl implements expiredDrugSerivce {
	
	@Autowired
	ExpiredDrugsMapper expiredDrugMapper;

	@Override
	public int deleteByPrimaryKey(Integer expnumber) {
		// TODO Auto-generated method stub
		return expiredDrugMapper.deleteByPrimaryKey(expnumber);
	}

	@Override
	public int insert(ExpiredDrugs record) {
		// TODO Auto-generated method stub
		return expiredDrugMapper.insert(record);
	}

	@Override
	public int insertSelective(ExpiredDrugs record) {
		// TODO Auto-generated method stub
		return expiredDrugMapper.insertSelective(record);
	}

	@Override
	public ExpiredDrugs selectByPrimaryKey(Integer expnumber) {
		// TODO Auto-generated method stub
		return expiredDrugMapper.selectByPrimaryKey(expnumber);
	}

	@Override
	public int updateByPrimaryKeySelective(ExpiredDrugs record) {
		// TODO Auto-generated method stub
		return expiredDrugMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(ExpiredDrugs record) {
		// TODO Auto-generated method stub
		return expiredDrugMapper.updateByPrimaryKey(record);
	}

	@Override
	public List<ExpiredDrugs> selectAll() {
		// TODO Auto-generated method stub
		return expiredDrugMapper.selectAll();
	}

}
