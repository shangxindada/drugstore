package com.shangxin.dao;

import java.util.List;

import com.shangxin.bean.OtherSellInfo;

public interface OtherSellInfoMapper {
    int deleteByPrimaryKey(String sellid);

    int insert(OtherSellInfo record);

    int insertSelective(OtherSellInfo record);

    OtherSellInfo selectByPrimaryKey(String sellid);

    int updateByPrimaryKeySelective(OtherSellInfo record);

    int updateByPrimaryKey(OtherSellInfo record);
    
    List<OtherSellInfo> selectOtherSellInfo();
}