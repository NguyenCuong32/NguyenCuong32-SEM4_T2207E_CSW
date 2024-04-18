package com.example.TestCSW.entity;

import jakarta.persistence.*;

import java.rmi.server.UID;
import java.util.UUID;

@Entity
@Table(name = "item_t")
public class Item {
    @Id
    @Column(name = "item_id")
    private String itemId;
//    private String itemId = UUID.randomUUID().toString();
    @Column(name = "item_name")
    private String itemName;
    @ManyToOne
    @JoinColumn(name = "item_type_id")
    private ItemType itemType;
    @Column(name = "price")
    private Double price;

    public Item() {
    }

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

    public ItemType getItemType() {
        return itemType;
    }

    public void setItemType(ItemType itemType) {
        this.itemType = itemType;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
