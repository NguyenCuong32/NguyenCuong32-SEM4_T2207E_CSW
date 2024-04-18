package com.example.demoapi.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="item_type_t")
public class itemtype {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "item_type_id")
    public Integer itemtypeid;

    @Column(name = "item_type_name",   length = 50)
    public String itemtypename;

//    @OneToMany(mappedBy = "item_type_id", cascade = CascadeType.ALL)
//   public List<items> items;

    public itemtype() {
    }

    public itemtype(Integer itemtypeid, String itemtypename /*List<items> items*/) {
        this.itemtypeid = itemtypeid;
        this.itemtypename = itemtypename;
//        this.items = items;
    }

    public Integer getItemtypeid() {
        return itemtypeid;
    }

    public void setItemtypeid(Integer itemtypeid) {
        this.itemtypeid = itemtypeid;
    }

    public String getItemtypename() {
        return itemtypename;
    }

    public void setItemtypename(String itemtypename) {
        this.itemtypename = itemtypename;
    }

//    public List<items> getitems() {
//        return items;
//    }
//
//    public void setitems(List<items> items) {
//        this.items = items;
//    }
}
