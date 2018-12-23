package com.softdev.system.feign.controller;
import io.swagger.annotations.Info;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.cloud.openfeign.FeignClientProperties;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.MediaType;
import javax.sound.midi.MidiDevice;

@FeignClient(
        name = "card",
        url = "http://127.0.0.1:9999/demo/getData/222?data=hahahha",
        fallback = CardFeignClient.DefaultFallback.class,
        configuration = FeignClientConfiguration.class
)
@RequestMapping(value = "/v1/card")
public interface CardFeignClient {

    @RequestMapping(value = "/balance", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)


    /**
     * 容错处理类，当调用失败时，简单返回空字符串
     */
    @Component
    public class DefaultFallback implements GitHubClient {
        @Override
        public String searchRepo(@RequestParam("q") String queryStr) {
            return "null value in xgp feign";
        }
    }
}