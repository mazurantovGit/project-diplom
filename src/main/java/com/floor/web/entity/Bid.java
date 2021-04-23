package com.floor.web.entity;

import com.floor.web.utils.Constants;
import java.util.UUID;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


@EqualsAndHashCode(callSuper = false)
@Data
@Entity
public class Bid extends BaseEntity {

    private BigDecimal payment;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "bid_product",
            joinColumns = @JoinColumn(name = "bid_id"),
            inverseJoinColumns = @JoinColumn(name = "product_id")
    )
    private List<Product> products;

    @Enumerated(EnumType.STRING)
    private Constants.StatusBid status;

}
