package com.floor.web.entity;

import com.floor.web.utils.Constants.StatusService;
import java.math.BigDecimal;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = false)
@Data
@Entity
public class Product extends BaseEntity{

    private String name;

    private BigDecimal price;

    @Enumerated(EnumType.STRING)
    private StatusService status;
}
