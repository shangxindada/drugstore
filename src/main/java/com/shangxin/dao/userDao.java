package com.shangxin.dao;

import java.util.List;

import com.shangxin.bean.User;

public interface userDao {
	public User selectById(String userId);
	public List<User> selectAllUser();
	public void create(User user);
	public void deleteUserById(String userId);
}
