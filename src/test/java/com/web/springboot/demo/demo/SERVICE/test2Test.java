package com.web.springboot.demo.demo.SERVICE;

import com.web.springboot.demo.demo.entities.User;
import com.web.springboot.demo.demo.service.UserServiceImplementation;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.*;

class test2Test {
    @Mock
    UserServiceImplementation userService;

    @Test
    public void testDatabaseforUsers(){
        assertInstanceOf(User.class, userService.getUserById(1).get());
    }

}