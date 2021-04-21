package com.floor.web.entity;

import com.floor.web.utils.Constants.StatusProduct;
import java.math.BigDecimal;
import java.util.UUID;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = false)
@Data
@Entity
public class Product extends BaseEntity{

    @javax.persistence.Id
    @GeneratedValue
    private UUID id;

    private String name;

    private BigDecimal price;

    @Enumerated(EnumType.STRING)
    private StatusProduct status;
}
