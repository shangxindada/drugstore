package com.shangxin.serivce.serivcelmpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shangxin.bean.User;
import com.shangxin.dao.userDao;
import com.shangxin.serivce.userSerivce;

@Service
public class userServicelmpl implements userSerivce{
	@Autowired
	userDao dao;
	
	public User selectById(String userId){
		return dao.selectById(userId);
	}

	@Override
	public List<User> selectAllUser() {
		// TODO Auto-generated method stub
		return dao.selectAllUser();
	}

	@Override
	public void create(User user) {
		// TODO Auto-generated method stub
		dao.create(user);
	}

	@Override
	public void deleteUserById(String userId) {
		// TODO Auto-generated method stub
		dao.deleteUserById(userId);
	}

}
