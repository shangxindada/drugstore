package com.shangxin.dao;

import java.util.List;

import com.shangxin.bean.ExpiredDrugs;

public interface ExpiredDrugsMapper {
    int deleteByPrimaryKey(Integer expnumber);

    int insert(ExpiredDrugs record);

    int insertSelective(ExpiredDrugs record);

    ExpiredDrugs selectByPrimaryKey(Integer expnumber);

    int updateByPrimaryKeySelective(ExpiredDrugs record);

    int updateByPrimaryKey(ExpiredDrugs record);
    
    List<ExpiredDrugs> selectAll();
}