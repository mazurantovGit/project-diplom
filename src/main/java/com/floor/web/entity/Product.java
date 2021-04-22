package com.floor.web.entity;

import com.floor.web.utils.Constants.StatusProduct;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.math.BigDecimal;

@EqualsAndHashCode(callSuper = false)
@Data
@Entity
@NoArgsConstructor
public class Product extends BaseEntity {


    private String name;

    private BigDecimal price;

    @Enumerated(EnumType.STRING)
    private StatusProduct status;
}
