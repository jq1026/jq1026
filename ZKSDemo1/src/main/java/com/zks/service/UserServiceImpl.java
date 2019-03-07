package com.zks.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zks.dao.UserMapper;
import com.zks.model.User;
import com.zks.service.UserService;
@Service
public class UserServiceImpl implements UserService {
	 @Autowired
    private UserMapper userMapper;
    
	@Override
	public boolean login(String name, String password) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public List<User> queryAll() {
		// TODO Auto-generated method stub
		
		return userMapper.queryAll();
	}
	
	@Override
	public User getu(String name, String password) {
		// TODO Auto-generated method stub
		User user=userMapper.findByusername(name);
		if(user!=null && user.getPassword().equals(password)){
			return user;
		}
		return null;
	}
	@Override
	public void adduser(int uid, String name, String password) {
		// TODO Auto-generated method stub
		
		userMapper.adduser(uid, name, password);
		
	}
	@Override
	public void delete(int uid) {
		// TODO Auto-generated method stub
		userMapper.delete(uid);
	}
	@Override
	public void adduser2(User user) {
		// TODO Auto-generated method stub
		userMapper.adduser2(user);
	}
	@Override
	public User getone(String name) {
		// TODO Auto-generated method stub
		User user=userMapper.findByusername(name);
		return user;
	}
	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		userMapper.update(user);
	}

}
