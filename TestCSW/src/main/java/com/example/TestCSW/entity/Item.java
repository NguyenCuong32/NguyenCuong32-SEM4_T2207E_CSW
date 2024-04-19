package com.example.TestCSW.entity;

import jakarta.persistence.*;

@Entity
@Table(name="item_t")
public class Item {
    @Id
    @Column(name="item_id")
    private String id;
    @Column(name="item_name")
    private String name;
    @JoinColumn(name="item_type_id")
    @ManyToOne
    private ItemType itemType;

    private double price;

    public Item() {
    }

    public Item(String id, String name, ItemType itemType, double price) {
        this.id = id;
        this.name = name;
        this.itemType = itemType;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ItemType getItemType() {
        return itemType;
    }

    public void setItemType(ItemType itemType) {
        this.itemType = itemType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
