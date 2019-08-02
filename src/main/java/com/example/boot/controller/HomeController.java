package com.example.boot.controller;

import com.example.boot.domain.User;
import com.example.boot.service.impl.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@EnableAutoConfiguration
public class HomeController {
    @Autowired
    private TestService testService;

    @RequestMapping("/")
    @ResponseBody
    public String home(){
        return "hello world";
    }

    @RequestMapping("/get")
    @ResponseBody
    public int num(){
        return testService.testInterFace();
    }

    @RequestMapping("/getAll")
    @ResponseBody
    public List<User> getAll() {
        return testService.getAll();
    }
}
