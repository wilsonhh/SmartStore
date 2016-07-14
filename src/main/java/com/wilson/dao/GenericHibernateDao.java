package com.wilson.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.wilson.util.HibernateUtil;

public class GenericHibernateDao<T> implements DAO<T> {

	private Class persistentClass;
	
    HibernateUtil hibernate;
	
	

	public void setHibernate(HibernateUtil hibernate) {
		this.hibernate = hibernate;
	}

	public GenericHibernateDao(Class persistentClass) {
		this.persistentClass = persistentClass;
	}

	@Override
	public void save(T object) {
		// TODO Auto-generated method stub
		hibernate.create(object);
	
	}

	@Override
	public void delete(T object) {
		// TODO Auto-generated method stub
		hibernate.delete(object);
	}

	@Override
	public List<T> list() {
        return hibernate.fetchAll(persistentClass);
		
	}

	@Override
	public T searchByID(int id) {
		return (T)hibernate.fetchById(id, persistentClass);
	}

}
