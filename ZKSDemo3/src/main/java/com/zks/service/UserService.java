package com.zks.service;

import java.util.List;

import com.zks.model.User;

public interface UserService {
	
	 boolean login(String name,String password);
	 List<User>queryAll();	
	 User getu(String name,String password);
	 void adduser(int uid,String name,String password);
	 void delete(int uid);
	 void adduser2(User user);
	 User getone(String name);
	 void update (User user);
}
