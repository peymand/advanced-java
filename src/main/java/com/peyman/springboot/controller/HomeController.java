package com.peyman.springboot.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
@Slf4j

public class HomeController {

    @Value("${data.value}")
    private String dataValue;
    @Value("${location}")
    private String location;

    @GetMapping
    public String home(Model model){
        log.debug(dataValue);
        System.out.println(location);
        model.addAttribute("msg","Hello EL in Thymeleaf");
        return "index";
    }
}
