package com.example.TestCSW.dto;

public class PlayerBuyItemDTO {
    private String itemId;
    private Integer playerId;

    public PlayerBuyItemDTO() {
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
