package com.thinkgem.jeesite.modules.demo.controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.thinkgem.jeesite.modules.demo.component.NeoProperties;
import com.thinkgem.jeesite.modules.demo.dao.UserRepository;
import com.thinkgem.jeesite.modules.demo.entity.User;
import com.thinkgem.jeesite.modules.demo.service.RedisService;

@RestController
public class HelloWorldController {
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private RedisService redisService;
	
	
    @RequestMapping("/hello")
    public String hello() {
    
    	return "Hello World";

    }
    
    
    @RequestMapping("/saveUser")
    public String saveUser(@RequestParam String username, @RequestParam String password, @RequestParam String email,@RequestParam String nickname){
    	User user = new User();
    	user.setId(UUID.randomUUID().toString());
    	user.setUserName(username);
    	user.setPassWord(password);
    	user.setNickName(nickname);
    	user.setEmail(email);
    	userRepository.save(user);
    	return "保存用户信息成功";
    }
    
    @RequestMapping("/getUser")
    public User getUser(){
    	User user = new User();
    	user.setUserName("小明");
    	
    	return user;
    }
    
    @RequestMapping("/getComponent")
    public NeoProperties getComponent(){
    	return new NeoProperties() ;
    }
    
    @RequestMapping("redisSetKeyTest")
    public String redisSetKeyTest(){
    	redisService.set("1","22222");
    	return "设置键值对成功";
    }
    
    

}