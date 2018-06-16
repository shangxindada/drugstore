package com.shangxin.serivce;

import java.util.List;

import com.shangxin.bean.User;


public interface userSerivce {
	public User selectById(String userId);
	public List<User> selectAllUser();
	public void create(User user);
	public void deleteUserById(String userId);
}
