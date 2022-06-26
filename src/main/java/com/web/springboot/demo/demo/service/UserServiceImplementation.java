package com.web.springboot.demo.demo.service;

import com.web.springboot.demo.demo.Exceptions.UserExceptions;
import com.web.springboot.demo.demo.entities.User;
import com.web.springboot.demo.demo.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public abstract class UserServiceImplementation implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User addUser(User user) throws Exception{
        Optional<User> findIfUserExists = userRepository.findById(user.getId());

        if(findIfUserExists.isPresent()){
            throw new UserExceptions("Useri ekziston");
        }
        return userRepository.save(user);
    }

    @Override
    public Optional<User> getUser(long id) throws Exception{
        return Optional.ofNullable(userRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Useri me id: " + id + " nuk ekziston")));
    }

    @Override
    public User editUserById(User user, long id) throws Exception {

        if (!(userRepository.findById(id).isPresent())){
            throw new Exception("Useri me id" + id + "nuk ekziston");
        }
        user.setId(id);
        return userRepository.save(user);
    }
}