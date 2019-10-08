package com.web.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value="reglogin")
@RequestMapping("/index")
public interface LoginInterface {

    @RequestMapping(value={"/login"}, method= RequestMethod.GET)
    public int login();

    @RequestMapping(value={"/regin"}, method= RequestMethod.POST)
    public int regin();
}
