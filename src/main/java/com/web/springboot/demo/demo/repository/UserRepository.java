package com.web.springboot.demo.demo.repository;
import com.web.springboot.demo.demo.entities.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

public interface UserRepository extends CrudRepository<User, Long> {

    Optional<User> findById(long id);
}
