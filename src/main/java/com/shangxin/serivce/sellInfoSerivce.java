package com.shangxin.serivce;

import java.sql.Date;
import java.util.List;

import com.shangxin.bean.SellInfo;

public interface sellInfoSerivce {
	int deleteByPrimaryKey(String sellnumber);

    int insert(SellInfo record);

    int insertSelective(SellInfo record);

    SellInfo selectByPrimaryKey(String sellnumber);

    int updateByPrimaryKeySelective(SellInfo record);

    int updateByPrimaryKey(SellInfo record);
    
    float selectAllPrice(String sellId);
    
    List<SellInfo> selectBySellId(String sellId);
    
    int deleteBySellId(String sellId);
    
    List<String> selectByDate(Date startDate,Date endDate);
    
    int selectStock(String drugNumber,Date startDate,Date endDate);
}
