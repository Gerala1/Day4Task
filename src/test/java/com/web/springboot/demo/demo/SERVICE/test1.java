package com.web.springboot.demo.demo.SERVICE;
import com.web.springboot.demo.demo.service.UserServiceImplementation;
import com.web.springboot.demo.demo.entities.User;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest(classes = {UserServiceImplementation.class})
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class test1 {
    @Mock
    UserServiceImplementation userService;

    /*
    @Test
    public void testDatabaseforUsers(){
        assertInstanceOf(User.class, userService.getUserById(1).get());
    }


     */
}
