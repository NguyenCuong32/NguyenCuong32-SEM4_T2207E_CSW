package com.example.TestCSW.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "player_t")
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "player_id")
    private Integer playerId;
    @Column(name = "player_name")
    private String playerName;
    @Column(name = "player_national")
    private String playerNational;

    public Player() {
    }

    public Integer getPlayerId() {
        return playerId;
    }

    public void setPlayerId(Integer playerId) {
        this.playerId = playerId;
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
