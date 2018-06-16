package com.shangxin.dao;

import java.sql.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.shangxin.bean.WarehousingInfo;

public interface WarehousingInfoMapper {
    int deleteByPrimaryKey(Integer warehousingid);

    int insert(WarehousingInfo record);

    int insertSelective(WarehousingInfo record);

    WarehousingInfo selectByPrimaryKey(Integer warehousingid);
    
    List<WarehousingInfo> selectWarehousingInfo();

    int updateByPrimaryKeySelective(WarehousingInfo record);

    int updateByPrimaryKey(WarehousingInfo record);
    
    List<String> selectByDate(@Param("startDate") Date startDate,@Param("endDate")Date endDate);
    
    int selectStock(@Param("drugNumber") String drugNumber,@Param("startDate") Date startDate,@Param("endDate")Date endDate);
}