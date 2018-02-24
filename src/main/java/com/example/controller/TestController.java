package com.example.controller;

import com.example.serviceInterface.ModuleOneInterface;
import com.netflix.discovery.EurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by admin on 2018/2/23.
 */
@RestController
public class TestController {

    @Autowired
    private ModuleOneInterface moduleOneInterface;

    @RequestMapping("/showName")
    public String showName(){
        return moduleOneInterface.showName();
    }



}
