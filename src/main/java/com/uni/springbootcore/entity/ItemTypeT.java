package com.uni.springbootcore.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "item_type_t")
public class ItemTypeT {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "item_type_id", nullable = false)
    private Integer id;

    @Column(name = "item_type_name", length = 50)
    private String itemTypeName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getItemTypeName() {
        return itemTypeName;
    }

    public void setItemTypeName(String itemTypeName) {
        this.itemTypeName = itemTypeName;
    }

}