package com.example.demoapi.entity.Procedure;

import com.example.demoapi.entity.itemtype;
import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
public class playerInfo {

    @Id
    private String id;
    @Column(name = "player_id")
    public Integer playerid;
    @Column(name="player_name")
    public String playername;

    @Column(name ="player_national" )
    public String playernational;

    @Column(name = "item_name"   )
    public String itemname ;

    @Column(name = "price" , precision = 21, scale = 6)
    private BigDecimal price ;
    @Column(name = "item_type_name",   length = 50)
    public String itemtypename;

    public playerInfo(String id, Integer playerid, String playername, String playernational, String itemname, BigDecimal price, String itemtypename) {
        this.id = id;
        this.playerid = playerid;
        this.playername = playername;
        this.playernational = playernational;
        this.itemname = itemname;
        this.price = price;
        this.itemtypename = itemtypename;
    }

    public playerInfo() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getPlayerid() {
        return playerid;
    }

    public void setPlayerid(Integer playerid) {
        this.playerid = playerid;
    }

    public String getPlayername() {
        return playername;
    }

    public void setPlayername(String playername) {
        this.playername = playername;
    }

    public String getPlayernational() {
        return playernational;
    }

    public void setPlayernational(String playernational) {
        this.playernational = playernational;
    }

    public String getItemname() {
        return itemname;
    }

    public void setItemname(String itemname) {
        this.itemname = itemname;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getItemtypename() {
        return itemtypename;
    }

    public void setItemtypename(String itemtypename) {
        this.itemtypename = itemtypename;
    }
}
