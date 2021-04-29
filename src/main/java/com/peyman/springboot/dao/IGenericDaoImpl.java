package com.peyman.springboot.dao;

import com.peyman.springboot.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class IGenericDaoImpl<T,P> implements IGenericDao<T,P> {

    @PersistenceContext
    EntityManager entityManager;

    private Class< T > clazz;

    public void setClazz( Class< T > clazzToSet ) {
        this.clazz = clazzToSet;
    }

    @Override
    public T find(P id) {
        return entityManager.find(clazz,id);
    }



    @Override
    public void delete(P id) {

    }
}
