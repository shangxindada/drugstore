package com.shangxin.dao;

import java.sql.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.shangxin.bean.SellInfo;

public interface SellInfoMapper {
    int deleteByPrimaryKey(String sellnumber);

    int insert(SellInfo record);

    int insertSelective(SellInfo record);

    SellInfo selectByPrimaryKey(String sellnumber);

    int updateByPrimaryKeySelective(SellInfo record);

    int updateByPrimaryKey(SellInfo record);
    
    float selectAllPrice(String sellId);
    
    List<SellInfo> selectBySellId(String sellId);
    
    int deleteBySellId(String sellId);
    
    List<String> selectByDate(@Param("startDate") Date startDate,@Param("endDate")Date endDate);
    
    int selectStock(@Param("drugNumber") String drugNumber,@Param("startDate") Date startDate,@Param("endDate")Date endDate);
}