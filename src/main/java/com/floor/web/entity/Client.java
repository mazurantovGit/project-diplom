package com.floor.web.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import java.util.UUID;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class Client extends BaseEntity {

    private String name;

    private String email;

    private String phoneNumber;
}
