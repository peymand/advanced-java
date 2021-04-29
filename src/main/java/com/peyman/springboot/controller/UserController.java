package com.peyman.springboot.controller;

import com.peyman.springboot.controller.dto.UserDto;
import com.peyman.springboot.entities.User;
import com.peyman.springboot.serivce.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.awt.*;

@RestController
@RequestMapping("/student")
public class UserController {

    @Autowired
    IUserService iUserService;


    @PostMapping(value = "/find/{id}",produces = MediaType.APPLICATION_JSON_VALUE )
    public ResponseEntity<UserDto> find(@PathVariable int id){
        UserDto user  = iUserService.find(Long.valueOf(id));
        ResponseEntity<UserDto> res = new ResponseEntity<>(user , HttpStatus.OK);
        return res;
    }

}
