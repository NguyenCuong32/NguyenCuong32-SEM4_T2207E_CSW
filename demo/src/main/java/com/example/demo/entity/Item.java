package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Table(name = "item_t")
@Getter
@Setter
public class Item {
    @Id
    @Column(name = "item_id")
    private String itemId;
    @Column(name = "item_name")
    private String itemName;
    @ManyToOne
    @JoinColumn(name = "item_type_id")
    private ItemType itemType;
    @Column(name = "price")
    private BigDecimal price;
}
