package com.floor.web.entity;

import com.floor.web.utils.Constants;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


@EqualsAndHashCode(callSuper = false)
@Data
@Entity
public class Bid extends BaseEntity {


    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "client_id")
    private Client client;

    private BigDecimal payment;

    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "product_id")
    private List<Product> products;

    @Enumerated(EnumType.STRING)
    private Constants.StatusBid status;
}
