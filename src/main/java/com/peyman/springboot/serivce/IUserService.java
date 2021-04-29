package com.peyman.springboot.serivce;

import com.peyman.springboot.controller.dto.UserDto;
import com.peyman.springboot.entities.User;

public interface IUserService {

    UserDto find(Long id);
    void delete(int id);


}
