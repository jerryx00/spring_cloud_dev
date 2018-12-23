package com.softdev.system.feign.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import com.softdev.system.feign.util.ApiReturnObject;

//@FeignClient(name = "spring-cloud-study-demo")
@FeignClient(name = "spring-cloud-study-demo",url="http://localhost:9999")
//@FeignClient(value = "demo",path = "/demo")
public interface DemoRemoteClient {

	@RequestMapping(value = "/demo/getData/{uid}",method = RequestMethod.GET)
	public ApiReturnObject getData(@PathVariable(value="uid") String uid,@RequestParam(value="data") String data);

}
