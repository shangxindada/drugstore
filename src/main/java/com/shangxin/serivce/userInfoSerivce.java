package com.shangxin.serivce;

import java.util.List;


import com.shangxin.bean.UserInfo;

public interface userInfoSerivce {
	public List<UserInfo> selectAllUserInfo();
	public UserInfo selectByUserId(String UserId);
	public void inserUserInfo(String userId);
	public void updateUserInfo(UserInfo userInfo);
}
