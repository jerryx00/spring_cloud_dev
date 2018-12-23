package com.softdev.system.feign.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;


/**
 * 失败回调
 *
 * @author yeqj
 */
@Component
public class UserClientFallback implements UserClient {
    private static Logger log = LogManager.getLogger(UserClientFallback.class);

    @Override
    public String hello(String username, String password) {
        log.error("远程调用失败，注册专家学者失败，参数：[username=" + username + ",password=" + password + "]");
        return "0";
    }
}
