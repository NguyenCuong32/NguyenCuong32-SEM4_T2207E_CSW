package com.uni.springbootcore.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "player_t")
public class PlayerT {
    @Id
    @Column(name = "player_id", nullable = false)
    private Integer id;

    @Column(name = "player_name", length = 120)
    private String playerName;

    @Column(name = "player_national", length = 50)
    private String playerNational;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getPlayerNational() {
        return playerNational;
    }

    public void setPlayerNational(String playerNational) {
        this.playerNational = playerNational;
    }

}