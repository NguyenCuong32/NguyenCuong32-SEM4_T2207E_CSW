package com.example.demoapi.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.UUID;

@Entity
@Table(name="item_t")
public class items {

    @Id
    @Column(name = "item_id",   length = 10, nullable = false)
    public String itemid;


    @Column(name = "item_name" , length = 120 )
    public String itemname ;

    @ManyToOne
    @JoinColumn(name = "item_type_id"  )
    public itemtype item_type_id ;

    @Column(name = "price" , precision = 21, scale = 6)
    private BigDecimal price ;


    public items() {
        this.itemid = UUID.randomUUID().toString().substring(0, 10);
    }

    public items(String itemid, String itemname, com.example.demoapi.entity.itemtype itemtype, BigDecimal price) {
        this.itemid = itemid;
        this.itemname = itemname;
        this.item_type_id = itemtype;
        this.price = price;
    }


    public String getItemid() {
        return itemid;
    }

    public void setItemid(String itemid) {
        this.itemid = itemid;
    }

    public String getItemname() {
        return itemname;
    }

    public void setItemname(String itemname) {
        this.itemname = itemname;
    }

    public itemtype getItem_type_id() {
        return item_type_id;
    }

    public void setItem_type_id(itemtype item_type_id) {
        this.item_type_id = item_type_id;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
