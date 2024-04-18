package com.example.TestCSW.dto;

import java.math.BigDecimal;

public class PlayerInforDTO {
    private Integer PlayerId;
    private String PlayerName;
    private String PlayerNational;
    private String ItemName;
    private BigDecimal Price;
    private String ItemTypeName;
    public PlayerInforDTO() {
    }

    public Integer getPlayerId() {
        return PlayerId;
    }

    public void setPlayerId(Integer playerId) {
        PlayerId = playerId;
    }

    public String getPlayerName() {
        return PlayerName;
    }

    public void setPlayerName(String playerName) {
        PlayerName = playerName;
    }

    public String getPlayerNational() {
        return PlayerNational;
    }

    public void setPlayerNational(String playerNational) {
        PlayerNational = playerNational;
    }

    public String getItemName() {
        return ItemName;
    }

    public void setItemName(String itemName) {
        ItemName = itemName;
    }

    public BigDecimal getPrice() {
        return Price;
    }

    public void setPrice(BigDecimal price) {
        Price = price;
    }

    public String getItemTypeName() {
        return ItemTypeName;
    }

    public void setItemTypeName(String itemTypeName) {
        ItemTypeName = itemTypeName;
    }
}
