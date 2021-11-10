package com.brennanmanion.dao;

import java.util.List;

import com.brennanmanion.pojo.User;

public interface IUserDao extends IGenericDao<User>{
	List<User> findAll();
}
