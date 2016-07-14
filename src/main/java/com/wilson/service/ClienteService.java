package com.wilson.service;

import java.util.List;

import com.wilson.model.Cliente;
 
public interface ClienteService {
 
    public void save(Cliente p);
    public void delete(Cliente p);
    public List<Cliente> list();
     
}