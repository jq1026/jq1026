package com.zks.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zks.model.User;

public interface UserMapper {
	
	List<User> queryAll();//��ȡ����
	User findByusername(String name);//�����û������user��
	void adduser(int uid,String name,String password);//���
	void delete(@Param("uid")int uid);//����uidɾ��
	void adduser2(User user);
	int update (User user);//�޸�
}
