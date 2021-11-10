package com.brennanmanion.services;

import java.util.List;

import com.brennanmanion.pojo.User;

public interface IUserService {
	List<User> findAll();
	void save(final User user);	
}
