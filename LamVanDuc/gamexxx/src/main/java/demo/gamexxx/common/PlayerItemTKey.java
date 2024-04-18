package demo.gamexxx.common;


import jakarta.persistence.Id;

import java.io.Serializable;

public class PlayerItemTKey implements Serializable {
    private String itemId;
    private Integer playerId;

    public PlayerItemTKey() {
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

    public PlayerItemTKey(String itemId, Integer playerId) {
        this.itemId = itemId;
        this.playerId = playerId;
    }
}
