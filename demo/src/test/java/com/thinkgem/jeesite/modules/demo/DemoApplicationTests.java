package com.thinkgem.jeesite.modules.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.thinkgem.jeesite.modules.demo.component.NeoProperties;
import com.thinkgem.jeesite.modules.demo.dao.UserRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {
	@Autowired
	UserRepository userRepository;
	@Autowired
	NeoProperties neoProperties;
	
	@Test
	public void contextLoads() {
		System.out.println(userRepository.findAll().size());
		System.out.println(neoProperties.getTitle());
	}

}
