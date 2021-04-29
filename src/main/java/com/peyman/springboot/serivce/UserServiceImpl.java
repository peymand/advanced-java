package com.peyman.springboot.serivce;

import com.peyman.springboot.controller.dto.UserDto;
import com.peyman.springboot.dao.IGenericDao;
import com.peyman.springboot.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Locale;

@Service
public class UserServiceImpl implements IUserService {


    IGenericDao<User,Long> userDao;

    public UserServiceImpl(IGenericDao<User,Long> userDao){
        this.userDao = userDao;

    }

    @Override
    public UserDto find(Long id) {
        User user = userDao.find(id);
        //convert user to userDTO
        return new UserDto();
    }

    @Override
    public void delete(int id) {

    }
}
