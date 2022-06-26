package com.web.springboot.demo.demo.SERVICE;
import com.web.springboot.demo.demo.Controller.SpidController;
import com.web.springboot.demo.demo.entities.Spid;
import com.web.springboot.demo.demo.entities.Status;
import com.web.springboot.demo.demo.entities.Type;
import com.web.springboot.demo.demo.repository.SpidRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

@SpringBootTest(classes = {SpidController.class})
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class TEST {
    SpidRepository spidRepository;

    @Test
    void addSpid() {
        Spid spid = new Spid();
        spid.setId(2L);
        spid.setStatus(Status.READY_FOR_REVIEW);
        spid.setCreatedBy("test");
        spid.setType(Type.LEVEL_1);
        spid.setCreatedAt(LocalDateTime.now());
    }

    @Test
    void changeSpidStatus() {
        Spid spid = spidRepository.findById(2L).get();
        spid.setStatus(Status.PENDING);
        spidRepository.save(spid);
    }

    @Test
    void deleteSpid() {
        Spid spid = spidRepository.findById(2L).get();
        spidRepository.delete(spid);
    }

}
