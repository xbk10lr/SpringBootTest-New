package com.xbk.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	private static final Logger log = LoggerFactory.getLogger(HelloWorldController.class);
    @RequestMapping("/hello")
    public String index() {
    	log.debug(">>>>>>>>>>>>>>>>>>test log debug<<<<<<<<<<<<<<<<<<<<<<");
    	log.info(">>>>>>>>>>>>>>>>>>test log info<<<<<<<<<<<<<<<<<<<<<<");
        return "Hello World1";
    }
}
