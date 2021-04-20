package com.floor.web.entity;


import java.util.Date;
import java.util.UUID;
import javax.persistence.MappedSuperclass;
import javax.persistence.Version;
import lombok.Data;
import org.springframework.data.annotation.Id;
import javax.persistence.GeneratedValue;

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

}
