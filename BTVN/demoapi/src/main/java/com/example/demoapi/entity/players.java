package com.example.demoapi.entity;

import jakarta.persistence.*;

import java.util.Collection;

@Entity
@Table(name="player_t")
public class players {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "player_id" )
    public Integer playerid;

    @Column(name="player_name",   length = 120 )
    public String playername;

    @Column(name ="player_national"  , length = 50  )
    public String playernational;


    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(
            name = "player_item_t",
            joinColumns = @JoinColumn(name = "player_id"),
            inverseJoinColumns = @JoinColumn(name = "item_id")
    )
    private Collection<items> itemofplayer;


    public players() {
    }

    public players(Integer playerid, String playername, String playernational, Collection<items> itemofplayer) {
        this.playerid = playerid;
        this.playername = playername;
        this.playernational = playernational;
        this.itemofplayer = itemofplayer;
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

    public Collection<items> getItemofplayer() {
        return itemofplayer;
    }

    public void setItemofplayer(Collection<items> itemofplayer) {
        this.itemofplayer = itemofplayer;
    }
}
