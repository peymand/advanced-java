package com.peyman.springboot.serivce;

import com.peyman.springboot.dao.IGenericDao;
import com.peyman.springboot.entities.Teacher;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.criteria.CriteriaBuilder;

public class TeacherServiceImpl implements ITeacherService {

    @Autowired
    IGenericDao<Teacher, Integer> dao;

    @Override
    public Teacher find(Integer id) {
        return dao.find(id);
    }
}
