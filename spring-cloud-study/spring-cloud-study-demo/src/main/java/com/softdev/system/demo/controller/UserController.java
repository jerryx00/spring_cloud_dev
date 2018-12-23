package com.softdev.system.demo.controller;

import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

public class UserController {
    /**
     *
     *
     * @param username
     * @param password
     * @return
     */


    @RequestMapping(value = "/hello", method = RequestMethod.POST)
    public String hello(@RequestParam("username") String username, @RequestParam("password") String password) {
         return "hello";
    }

}
