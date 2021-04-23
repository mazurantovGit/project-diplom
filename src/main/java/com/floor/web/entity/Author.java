package com.floor.web.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Data
@Entity
public class Author {

    @Id
    private String id;

    private String name;

    private String userpic;

    private String email;

    private String locale;

    private LocalDateTime lastVisit;
}
