package com.peyman.springboot.dao;

public interface IGenericDao<T, P> {

    T find(P id);
    void delete(P id);
}
