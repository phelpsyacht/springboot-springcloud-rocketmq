package com.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @Autowired
    private LoginInterface loginInterface;

    @RequestMapping(value={"/loginIndex"}, method= RequestMethod.GET)
    public int login(){
         return loginInterface.login();

    }

    @RequestMapping(value={"/reginIndex"}, method= RequestMethod.POST)
    public int regin(){
        return loginInterface.regin();
    }
}
