package com.web.springboot.demo.demo.service;

import com.web.springboot.demo.demo.entities.Spid;
import com.web.springboot.demo.demo.entities.Status;
import com.web.springboot.demo.demo.entities.User;
import com.web.springboot.demo.demo.repository.SpidRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SpidServiceImplementation implements SpidService {

    @Autowired
    private SpidRepository spidRepository;

    @Override
    public Spid addSpid(Spid spid) {
        return spidRepository.save(spid);
    }

    @Override
    public List<Spid> getAllSpids() {
        return null;
    }

    @Override
    public Spid getSpidByUserId(Spid spidId, User user) {
        Spid spid = getSpid(spidId);
        spid.getUserId();
        return spid;
    }

    @Override
    public Spid changeSpidStatus(Spid spid) {
        spid.setStatus(Status.READY_FOR_REVIEW);
        return spidRepository.save(spid);
    }

    @Override
    public Spid deleteSpid(Spid spid) {
        if (spid.getStatus() != Status.PENDING) {
            System.out.println("Status is PENDING :(");
        }
        spidRepository.delete(spid);
        return spid;
    }

    @Override
    public Spid getSpid(Spid spids) {
        List<Spid> spid = (List<Spid>) spidRepository.findAll();
        return (Spid) spid;
    }
}


