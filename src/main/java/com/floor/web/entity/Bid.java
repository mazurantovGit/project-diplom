package com.floor.web.entity;

import com.floor.web.utils.Constants;
import java.math.BigDecimal;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import lombok.Data;
import lombok.EqualsAndHashCode;


@EqualsAndHashCode(callSuper = true)
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
