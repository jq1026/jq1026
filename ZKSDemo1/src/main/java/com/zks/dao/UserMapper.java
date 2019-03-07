package com.zks.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zks.model.User;

public interface UserMapper {
	
	List<User> queryAll();//获取所有
	User findByusername(String name);//根据用户名获得user表
	void adduser(int uid,String name,String password);//添加
	void delete(@Param("uid")int uid);//根据uid删除
	void adduser2(User user);
	int update (User user);//修改
}
