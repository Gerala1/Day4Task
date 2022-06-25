package com.web.springboot.demo.demo.service;

import com.web.springboot.demo.demo.entities.User;
import com.web.springboot.demo.demo.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImplementation implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User addUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User getUser(Long userId) {
        return userRepository.findById(userId).orElseThrow(() -> new IllegalArgumentException("Useri me Id: " + userId + " nuk ekziston"));
    }

    @Override
    public User editUserById(Long userId, String name, String surname, String email) {
        Optional<User> user = Optional.ofNullable
                (userRepository.findById
                        (userId).orElseThrow(() ->
                        new IllegalArgumentException
                                ("Useri me Id: " + userId + " nuk ekziston")));

        user.get().setName(name);
        user.get().setSurname(surname);
        user.get().setEmail(email);
        return userRepository.save(user.get());

    }

    @Override
    public Optional<User> getUserById(long id) {
        return userRepository.findById(id);
    }
}



