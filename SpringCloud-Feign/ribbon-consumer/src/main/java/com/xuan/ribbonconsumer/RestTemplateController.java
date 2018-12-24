package com.xuan.ribbonconsumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
//@RequestMapping("/u")
public class RestTemplateController {
    private static final Logger log = LoggerFactory.getLogger(RestTemplateController.class);
    @Autowired
    RestTemplate restAppTemplate;

    @GetMapping("/hello")
    public String a() {
        String url1 = "http://localhost:8090/hello";
        String result1 = restAppTemplate.getForObject(url1, String.class);
        log.info("[查询所有result1] - {}\n", result1);
        return result1;
    }
}
