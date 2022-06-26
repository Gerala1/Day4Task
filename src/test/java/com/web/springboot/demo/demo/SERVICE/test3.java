package com.web.springboot.demo.demo.SERVICE;

import com.web.springboot.demo.demo.entities.Spid;
import com.web.springboot.demo.demo.entities.Status;
import com.web.springboot.demo.demo.service.SpidServiceImplementation;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = {SpidServiceImplementation.class})
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class test3 {
    @Mock
    SpidServiceImplementation spidService;

    @BeforeAll
    public void setup() {
        Spid spid = new Spid();
        spid.setId(1);
        spid.setStatus(Status.READY_FOR_REVIEW);

    }
}
