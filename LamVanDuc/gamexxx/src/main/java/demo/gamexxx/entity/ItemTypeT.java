package demo.gamexxx.entity;


import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "item_type_T")
public class ItemTypeT {

    @Id
    @Column(name = "item_type_id")
    private Integer itemTypeId;
    private String itemTypeName;

    public Integer getItemTypeId(){
        return itemTypeId;
    }

    public void setItemTypeId(Integer itemTypeId){
        this.itemTypeId=itemTypeId;
    }

    public String getItemTypeName(){
        return itemTypeName;
    }

    public void setItemTypeName(String itemTypeName){
        this.itemTypeName=itemTypeName;
    }
}
