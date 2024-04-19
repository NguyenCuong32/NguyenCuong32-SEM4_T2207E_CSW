package com.uni.springbootcore.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "item_t")
public class ItemT {
    @Id
    @Column(name = "item_id", nullable = false, length = 10)
    private String itemId;

    @Column(name = "item_name", length = 120)
    private String itemName;

    @ManyToOne
    @JoinColumn(name = "item_type_id")
    private ItemTypeT itemType;

    @Column(name = "price", precision = 21, scale = 6)
    private BigDecimal price;

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public ItemTypeT getItemType() {
        return itemType;
    }

    public void setItemType(ItemTypeT itemType) {
        this.itemType = itemType;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }


}