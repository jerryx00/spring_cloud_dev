package com.softdev.system.feign.controller;

import com.softdev.system.feign.entity.UserInfo;
import io.swagger.models.Info;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/v1/card")
public class IndexApi {

    @PostMapping("/balance")
    @ResponseBody
    public UserInfo index() {
        UserInfo ui = new UserInfo();
        ui.setCode("2018");;
        ui.setName("love");
        return ui;

    }
}