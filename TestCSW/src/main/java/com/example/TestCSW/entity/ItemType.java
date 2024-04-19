package com.example.TestCSW.entity;

import jakarta.persistence.*;

@Entity
@Table(name="item_type_t")
public class ItemType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="item_type_id")
    private Integer id;
    @Column(name="item_type_name")
    private String name;

    public ItemType() {
    }

    public ItemType(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
