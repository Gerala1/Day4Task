package com.web.springboot.demo.demo.service;
import com.web.springboot.demo.demo.entities.Spid;
import com.web.springboot.demo.demo.entities.User;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public interface SpidService {
     Spid addSpid(Spid spid) throws Exception;

     Iterable<Spid> getAllSpids() throws Exception;

    List<Spid> getSpidByUserId(User user);
     Spid changeSpidStatus(long id) throws Exception;
    void deleteSpid(long id) throws Exception;
     Spid getSpid(Spid spid) throws Exception;

     Spid findSpidById(long id) throws Exception;

}
