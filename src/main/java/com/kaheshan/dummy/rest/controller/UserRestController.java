package com.kaheshan.dummy.rest.controller;


import com.kaheshan.dummy.dao.UserRepository;
import com.kaheshan.dummy.model.User;
import lombok.AllArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/rest/v1/users")
@AllArgsConstructor
public class UserRestController {

    private UserRepository userRepository;
//    private BCryptPasswordEncoder bCryptPasswordEncoder;


    @PostMapping("/signup")
    public void signUp(@RequestBody User user)
    {
        user.setPassword(user.getPassword());
        userRepository.save(user);
    }
}
