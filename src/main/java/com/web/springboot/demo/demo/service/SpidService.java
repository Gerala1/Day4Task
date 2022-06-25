package com.web.springboot.demo.demo.service;
import com.web.springboot.demo.demo.entities.Spid;
import com.web.springboot.demo.demo.entities.User;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public interface SpidService {
     Spid addSpid(Spid spid);

    List<Spid> getAllSpids();

    Spid getSpidByUserId(Spid spidId, User user);

    Spid changeSpidStatus(Spid spid);

    Spid deleteSpid(Spid spid);

    Spid getSpid(Spid spid);

}
