package com.brennanmanion.dao;

import org.hibernate.Session;
import org.joda.time.DateTime;

import com.brennanmanion.pojo.BaseModel;
import com.brennanmanion.pojo.IModel;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.lang.reflect.ParameterizedType;

public abstract class AbstractGenericDao<T extends BaseModel> implements IGenericDao<T> {
    @PersistenceContext
    protected EntityManager em;

    protected Class<T> entityClass =
            (Class<T>) ((ParameterizedType) this.getClass().getGenericSuperclass()).getActualTypeArguments()[0];

    @Override
    public T find(Long id) {
        return em.find(entityClass, id);
    }

    @Override
    public void save(T entity) {
    	setLastModified(entity);
    	setDefaults(entity);
        em.persist(entity);
    }

    @Override
    public T update(T entity) {
        return em.merge(entity);
    }

    @Override
    public void delete(final Long id) {
        em.remove(findReference(id));
    }

    @Override
    public T findReference(final Long id) {
        return em.getReference(entityClass, id);
    }

    @Override
    public Session getSession() {
        return (Session) this.em.getDelegate();
    }
    
    @Override
    public void setLastModified(final T entity)
    {
    	entity.setLastModified(new DateTime());
    }
    
    public abstract void setDefaults(final T entity);    
}
