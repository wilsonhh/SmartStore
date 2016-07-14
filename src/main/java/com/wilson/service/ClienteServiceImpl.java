package com.wilson.service;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wilson.dao.DAO;
import com.wilson.dao.GenericHibernateDao;
import com.wilson.model.Cliente;
import com.wilson.util.HibernateUtil;

@Service
@ManagedBean(name="clienteService")
@SessionScoped
public class ClienteServiceImpl implements ClienteService {

	DAO<Cliente> dao = new GenericHibernateDao<Cliente>(Cliente.class);
	
	@Autowired
	 HibernateUtil hibernate;

    public void setHibernate(HibernateUtil hibernate) {
		this.hibernate = hibernate;
	}

	@Override
    @Transactional
    public void save(Cliente p) {
    	hibernate.create(p);
    }
    
    @Override
    @Transactional
    public void delete(Cliente p) {
    	hibernate.delete(p);
    }
 
    @Override
    @Transactional
    public List<Cliente> list() {
        return hibernate.fetchAll(Cliente.class);
    }
 
}
