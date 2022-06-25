package com.web.springboot.demo.demo;

import com.web.springboot.demo.demo.entities.Spid;
import com.web.springboot.demo.demo.entities.Status;
import com.web.springboot.demo.demo.entities.Type;
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
	void contextLoads() {
		User user = userService.addUser(new User("Gera", "Lajthia", "1", "Gera Lajthia", "22334", "glajthia@gmail.com"));
		Spid spid = spidService.addSpid(new Spid(user , Status.PENDING, Type.LEVEL_2));
		System.out.println(userService.getUserById(1));
		System.out.println(spidService.getSpidByUserId(spid, user));

	}

}
