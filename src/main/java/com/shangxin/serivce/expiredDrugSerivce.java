package com.shangxin.serivce;

import java.util.List;

import com.shangxin.bean.ExpiredDrugs;

public interface expiredDrugSerivce {
	
	int deleteByPrimaryKey(Integer expnumber);

    int insert(ExpiredDrugs record);

    int insertSelective(ExpiredDrugs record);

    ExpiredDrugs selectByPrimaryKey(Integer expnumber);

    int updateByPrimaryKeySelective(ExpiredDrugs record);

    int updateByPrimaryKey(ExpiredDrugs record);
    
    List<ExpiredDrugs> selectAll();

}
