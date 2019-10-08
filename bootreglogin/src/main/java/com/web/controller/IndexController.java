package com.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/index")
public class IndexController {

    @RequestMapping(value={"/login"}, method = RequestMethod.GET)
    public int login(){

        return 8001;
    }

    @RequestMapping(value={"/regin"}, method = RequestMethod.POST)
    public int regin(){

        return 8001;
    }
}
