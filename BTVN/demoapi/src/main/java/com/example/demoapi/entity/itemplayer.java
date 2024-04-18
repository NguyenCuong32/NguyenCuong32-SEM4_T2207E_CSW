package com.example.demoapi.entity;

public class itemplayer {

    private String itemId;
    private Integer playerId;

    public itemplayer(String itemId, Integer playerId) {
        this.itemId = itemId;
        this.playerId = playerId;
    }

    public itemplayer() {
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public Integer getPlayerId() {
        return playerId;
    }

    public void setPlayerId(Integer playerId) {
        this.playerId = playerId;
    }
}
