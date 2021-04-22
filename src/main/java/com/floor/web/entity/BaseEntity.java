package com.floor.web.entity;


import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.UUID;

@MappedSuperclass
@Data
public abstract class BaseEntity {

    @Id
    @GeneratedValue
    private UUID id;

    @Version
    private Long version = 1L;

    private UUID authorId;

    private Date createDate;

    @PrePersist
    public void setCreateDate() {
        this.createDate = new Date();
    }

}
