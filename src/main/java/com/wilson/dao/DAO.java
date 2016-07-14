package com.wilson.dao;

import java.util.List;
 
public interface DAO<T> {
 
    public void save(T p);
    public void delete(T p);
    public List<T> list();
    public T searchByID(int id);
}