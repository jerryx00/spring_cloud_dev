package com.softdev.system.feign.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "demo", fallback = UserClientFallback.class)
public interface UserClient {

    /**
     * 注册专家学者
     */
    @RequestMapping(value = "/user/user/hello", method = RequestMethod.POST)
    String hello(@RequestParam("username") String username, @RequestParam("password") String password);
}
