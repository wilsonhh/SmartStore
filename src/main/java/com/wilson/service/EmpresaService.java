package com.wilson.service;

import java.util.List;

import com.wilson.model.Empresa;

public interface EmpresaService {
	public void save(Empresa e);
	public void delete(Empresa e);
	public List<Empresa> listAll();
}
