package com.web.springboot.demo.demo;

import com.web.springboot.demo.demo.entities.Spid;

import com.web.springboot.demo.demo.entities.User;
import com.web.springboot.demo.demo.service.SpidServiceImplementation;
import com.web.springboot.demo.demo.service.UserServiceImplementation;
import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Day4ApplicationTests {
	@Autowired
	private UserServiceImplementation userService;
	@Autowired
	private SpidServiceImplementation spidService;

	@Test
	void contextLoads() throws Exception {
		try {
			User user = userService.addUser(new User("Gera", "Lajthia", "1", "Gera Lajthia", "22334", "glajthia@gmail.com"));
			Spid spid = spidService.addSpid(new Spid());
			System.out.println(userService.getUser(1L));

		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}



