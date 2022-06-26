package com.web.springboot.demo.demo.service;


import com.web.springboot.demo.demo.entities.User;
import org.springframework.stereotype.Service;



import java.util.Optional;
@Service
public interface UserService {
     User addUser(User user) throws Exception;
    User getUser(Long userId);
    User editUserById(Long userId, String name, String surname, String email);



     Optional<User> getUserById(long id);

    Optional<User> getUser(long id) throws Exception;

    User editUserById(User user, long id) throws Exception;
}
