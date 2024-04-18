package demo.gamexxx.entity;


import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "item_t")
public class ItemT {
    @Id
    private String itemId;
    private String itemName;
    @Column(name = "item_type_id")
    private Integer itemTypeId;
    private BigDecimal price;

    public String getItemId(){
        return itemId;
    }

    public void setItemId(String itemId){
        this.itemId=itemId;
    }

    public String getItemName(){
        return itemName;
    }

    public void setItemName(String itemName){
        this.itemName=itemName;
    }

    public Integer getItemTypeId(){
        return itemTypeId;
    }

    public void setItemTypeId(Integer itemTypeId){
        this.itemTypeId=itemTypeId;
    }

    public BigDecimal getPrice(){
        return price;
    }

    public void setPrice(BigDecimal price){
        this.price=price;
    }
}
