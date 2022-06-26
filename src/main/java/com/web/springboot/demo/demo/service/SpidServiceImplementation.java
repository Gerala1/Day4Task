package com.web.springboot.demo.demo.service;

import com.web.springboot.demo.demo.entities.Spid;
import com.web.springboot.demo.demo.entities.Status;
import com.web.springboot.demo.demo.entities.User;
import com.web.springboot.demo.demo.repository.SpidRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;



@Service
public class SpidServiceImplementation implements SpidService {

    @Autowired
    private SpidRepository spidRepository;

    @Transactional
    @Override
    public Spid addSpid(Spid spid) throws Exception{
        Optional<Spid> findIfSpidExists = spidRepository.findById(spid.getId());
        if(!(findIfSpidExists.isPresent())){
            return spidRepository.save(spid);
        }
        throw new RuntimeException("Useri ekziston!");
    }


    @Override
    public Iterable<Spid> getAllSpids() throws Exception {
        List<Spid> spid = (List<Spid>) spidRepository.findAll();
        if(spid.isEmpty()){
            throw new Exception("Nuk gjendet Spid");
        }
        return spidRepository.findAll();
    }


    @Override
    public List<Spid> getSpidByUserId(User user) {
        return spidRepository.findSpidByUserId(user);
    }

    @Override
    public Spid changeSpidStatus(long id) throws Exception {
        Optional<Spid> findIfSpidExists = spidRepository.findById(id);
        Spid spid = findSpidById(id);
        if(!(findIfSpidExists.isPresent())){
            throw new Exception("Spidi nuk ekziston, statusi nuk mund te ndryshohet");
        }
        spid.setStatus(Status.PENDING);
        return spidRepository.save(spid);
    }

    @Override
    public void deleteSpid(long id) throws Exception {
        Optional<Spid> findIfSpidExists = spidRepository.findById(id);

        if (findIfSpidExists.isEmpty()) {
            throw new Exception("Spid me Id nuk ekziston");
        }
        spidRepository.deleteById(id);
    }

    @Override
    public Spid getSpid(Spid spids) throws Exception {
        List<Spid> spid = (List<Spid>) spidRepository.findAll();
        if (!(spid.size() <= 0)) {
            return spid.get(0);
        }
        throw new Exception("Spidi nuk ekziston");
    }

    @Override
    public Spid findSpidById(long id) throws Exception {
        Optional<Spid> spid = spidRepository.findById(id);
        if(spid.isPresent()){
            return spid.get();
        }
        throw new Exception("Spid me kete id nuk ekziston");
    }


}
