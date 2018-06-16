package com.shangxin.serivce;

import java.sql.Date;
import java.util.List;

import com.shangxin.bean.WarehousingInfo;

public interface warehousingInfoSerivce {
	int deleteByPrimaryKey(Integer warehousingid);

    int insert(WarehousingInfo record);

    int insertSelective(WarehousingInfo record);

    WarehousingInfo selectByPrimaryKey(Integer warehousingid);
    
    List<WarehousingInfo> selectWarehousingInfo();

    int updateByPrimaryKeySelective(WarehousingInfo record);

    int updateByPrimaryKey(WarehousingInfo record);
    
    List<String> selectByDate(Date startDate,Date endDate);
    
    int selectStock(String drugNumber,Date startDate,Date endDate);
}
