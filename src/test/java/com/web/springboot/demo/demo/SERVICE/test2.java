package com.web.springboot.demo.demo.SERVICE;
import com.web.springboot.demo.demo.Controller.SpidController;
import com.web.springboot.demo.demo.Controller.UserController;
import com.web.springboot.demo.demo.entities.User;
import com.web.springboot.demo.demo.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = {UserController.class})
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class test2 {
    UserRepository userRepository;

    @Test
    void addUser() {
        User user = new User();
        user.setName("Emri");
        user.setEmail("Shembull@email");
        user.setId(1L);
        user.setSurname("Mbiemri");
        user.setPassword("pasuordi");
        user.setCardNo("12345");
    }

    @Test
    void getUser() {
        User user = userRepository.findById(1L).get();
    }

}
