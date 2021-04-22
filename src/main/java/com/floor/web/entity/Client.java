package com.floor.web.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import java.util.UUID;

@EqualsAndHashCode(callSuper = false)
@Data
@Entity
public class Client extends BaseEntity {

    @javax.persistence.Id
    @GeneratedValue
    private UUID id;

    private String name;

    private String email;

    private String phoneNumber;
}
