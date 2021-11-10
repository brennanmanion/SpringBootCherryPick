package com.brennanmanion.dao;

import java.util.List;
import java.util.Map;

import org.joda.time.DateTime;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.brennanmanion.pojo.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Transactional
@Repository
public class UserDao extends AbstractGenericDao<User> implements IUserDao{

    @PersistenceContext
    private EntityManager em;	
	
	@Override
	public List<User> findAll() {
        String hql = "Select * from users";
        Query query = em.createQuery(hql);
        return query.getResultList();
	}
	
	@Override
	public void setDefaults(User user) {		
	}
}
