package com.floor.web.entity;

import com.floor.web.utils.Constants;
import lombok.Data;

import javax.persistence.*;
import java.util.UUID;

@Data
@Entity
public class Role {

    @Id
    @GeneratedValue
    private UUID id;

    @Enumerated(EnumType.STRING)
    @Column(length = 20)
    private Constants.ERole name;
}