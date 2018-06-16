package com.shangxin.dao;

import java.util.List;


import com.shangxin.bean.UserInfo;

public interface userInfoDao {
	public List<UserInfo> selectAllUserInfo();
	public UserInfo selectByUserId(String UserId);
	public void insertUserInfo(String userId);
	public void updateUserInfo(UserInfo userInfo);
}
