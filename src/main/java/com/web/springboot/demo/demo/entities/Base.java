package com.web.springboot.demo.demo.entities;
import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;
@Data
@MappedSuperclass
public class Base {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private LocalDateTime createdAt = LocalDateTime.now();
    private String createdBy;


}
