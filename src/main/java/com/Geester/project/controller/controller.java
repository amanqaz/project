package com.Geester.project.controller;


import com.Geester.project.model.userInfo;
import com.Geester.project.service.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController



public class controller {
    @Autowired
    userInfo data;
    @Autowired services services;


    @GetMapping("/counter")
    public String numberOfCount(){
        services.counter();

        return "Vistor  No.  "+data.getCount();
    }

}
