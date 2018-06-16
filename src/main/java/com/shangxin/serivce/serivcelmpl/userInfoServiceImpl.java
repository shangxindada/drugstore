package com.shangxin.serivce.serivcelmpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shangxin.bean.UserInfo;
import com.shangxin.dao.userInfoDao;
import com.shangxin.serivce.userInfoSerivce;

@Service
public class userInfoServiceImpl implements userInfoSerivce{
	
	@Autowired
	userInfoDao dao;

	@Override
	public List<UserInfo> selectAllUserInfo() {
		// TODO Auto-generated method stub
		return dao.selectAllUserInfo();
	}

	@Override
	public UserInfo selectByUserId(String UserId) {
		// TODO Auto-generated method stub
		return dao.selectByUserId(UserId);
	}

	@Override
	public void inserUserInfo( String userId) {
		// TODO Auto-generated method stub
		dao.insertUserInfo(userId);
	}

	@Override
	public void updateUserInfo(UserInfo userInfo) {
		// TODO Auto-generated method stub
		System.out.println(userInfo.getUserName());
		dao.updateUserInfo(userInfo);
	}

}
