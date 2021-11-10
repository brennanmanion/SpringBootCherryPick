package com.brennanmanion.dao;

import org.hibernate.Session;

import com.brennanmanion.pojo.IModel;

public interface IGenericDao<T extends IModel>{
    T find(final Long id);
    void save(final T entity);
    T update(final T entity);
    void delete(final Long id);
    T findReference(final Long id);
    Session getSession();
    void setLastModified(final T entity);
}
