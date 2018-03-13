package com.xbk.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/admin")
public class HelloXbkController {
	    @RequestMapping("index")
	    public ModelAndView page1() {
	        return new ModelAndView("/index.html") ;
	    }
	    
	    @RequestMapping("map")
	    public Map<String, String>  map1() {
	        Map<String, String> map = new HashMap<String, String>();
	        map.put("name", "张三");
	        map.put("age", "28");
	        return map;
	    }
	}
