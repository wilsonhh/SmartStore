package com.wilson.service;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wilson.dao.DAO;
import com.wilson.dao.GenericHibernateDao;
import com.wilson.model.Empresa;

@Service
@ManagedBean(name = "employeeService")
@SessionScoped
public class EmpresaServiceImpl implements EmpresaService {
	DAO<Empresa> dao = new GenericHibernateDao<Empresa>(Empresa.class);

	@Override
	@Transactional
	public void save(Empresa e) {
		dao.save(e);

	}

	@Override
	@Transactional
	public void delete(Empresa e) {
		dao.delete(e);

	}

	@Override
	@Transactional
	public List<Empresa> listAll() {
		return dao.list();
	}

}
