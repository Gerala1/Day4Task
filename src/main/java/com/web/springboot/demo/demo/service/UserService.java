package com.web.springboot.demo.demo.service;

import com.web.springboot.demo.demo.entities.Type;
import com.web.springboot.demo.demo.entities.User;
import org.springframework.stereotype.Service;
import com.web.springboot.demo.demo.repository.UserRepository;

import java.util.List;
import java.util.Optional;
@Service
public interface UserService {
    public User addUser(User user);
    public User getUser(Long userId);
    public User editUserById(Long userId, String name, String surname, String email);

    public Optional<User> getUserById(long id);
}
