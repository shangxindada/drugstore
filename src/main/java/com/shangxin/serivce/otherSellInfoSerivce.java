package com.shangxin.serivce;

import java.util.List;

import com.shangxin.bean.OtherSellInfo;

public interface otherSellInfoSerivce {
	int deleteByPrimaryKey(String sellid);

    int insert(OtherSellInfo record);

    int insertSelective(OtherSellInfo record);

    OtherSellInfo selectByPrimaryKey(String sellid);

    int updateByPrimaryKeySelective(OtherSellInfo record);

    int updateByPrimaryKey(OtherSellInfo record);
    
    List<OtherSellInfo> selectOtherSellInfo();
}
