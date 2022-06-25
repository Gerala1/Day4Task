package com.web.springboot.demo.demo.repository;
import com.web.springboot.demo.demo.entities.Spid;
import com.web.springboot.demo.demo.entities.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SpidRepository extends CrudRepository<Spid, Long> {
    List<Spid> findSpidByUserId(User user);
}
