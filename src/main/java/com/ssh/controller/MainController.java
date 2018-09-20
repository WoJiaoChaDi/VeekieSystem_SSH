package com.ssh.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ssh.service.TestService;

@Controller
public class MainController {
	
//	private static final Log log = LogFactory.getLog(MainController.class);
	private static Logger log = Logger.getLogger(MainController.class);  
	
	@Autowired
    private TestService testService;

    @RequestMapping(value = "test.do", method = RequestMethod.GET)
    public String test() throws Exception{
//        实际返回的是views/test.jsp ,spring-mvc.xml中配置过前后缀
    		log.info("这是info信息");
    		log.error("这是error信息");
    		log.debug("这是debug信息");
    		int a = 1/0;
    		return "test";
    }
    
    @RequestMapping(value = "index.do", method = RequestMethod.GET)
    public String index(){
//        实际返回的是views/test.jsp ,spring-mvc.xml中配置过前后缀
    	return "index";
    }
    
    @RequestMapping(value = "springtest.do", method = RequestMethod.GET)
    public String springTest(){
    	System.out.println(testService.test());
        return "test";
    }
}