package com.web.springboot.demo.demo.Controller;
import com.web.springboot.demo.demo.entities.Spid;
import com.web.springboot.demo.demo.service.SpidServiceImplementation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class SpidController {
    SpidServiceImplementation spidService;
    SpidController(SpidServiceImplementation spidService) {
        this.spidService = spidService;
    }

    private static final Logger log = LoggerFactory.getLogger(SpidController.class);

    @PostMapping("/create/Spid")
    public ResponseEntity<Spid> addSpid(
            @RequestBody Spid spid) throws Exception {
        log.info(spid.getCreatedBy());
        spidService.addSpid(spid);
        return new ResponseEntity(spid, HttpStatus.OK);
    }

    @GetMapping("/get/Spid")
    public ResponseEntity<Iterable<Spid>> getAllSpids() throws Exception {
        return new ResponseEntity<>(spidService.getAllSpids(), HttpStatus.OK);
    }

    @DeleteMapping("/delete/spid/{id}")
    public ResponseEntity<String> deleteSpid(
            @PathVariable(name = "id") long id) throws Exception {
        spidService.deleteSpid(id);
        return new ResponseEntity("Userii me kte id u fshi", HttpStatus.OK);
    }

    @GetMapping("/spid/{id}")
    public ResponseEntity<Spid> getSpid(
            @PathVariable(name = "id") long id
    ) throws Exception {
        return new ResponseEntity(spidService.findSpidById(id), HttpStatus.OK);
    }

    @GetMapping("/spid/changeStatus/{id}")
    public ResponseEntity<Spid> changeStatus(
            @PathVariable(name = "id") long id) throws Exception {
        return new ResponseEntity(spidService.changeSpidStatus(id), HttpStatus.OK);
    }


}

