package com.brennanmanion.services;

import java.util.List;

import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.brennanmanion.dao.IUserDao;
import com.brennanmanion.pojo.User;

@Service
@Transactional
public class UserService implements IUserService{

    @Autowired
    private IUserDao userDao;	
	
	@Override
	public List<User> findAll() {
		return userDao.findAll();
	}

	@Override
	public void save(User user) {
		user.setLastModified(new DateTime());
		userDao.save(user);
	}

}
