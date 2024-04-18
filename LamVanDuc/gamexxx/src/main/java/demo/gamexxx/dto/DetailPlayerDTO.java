package demo.gamexxx.dto;

import java.math.BigDecimal;

public class DetailPlayerDTO {
    private Integer playerId;
    private String playerName;
    private String playerNational;
    private String itemId;

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

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getItemTypeId() {
        return itemTypeId;
    }

    public void setItemTypeId(Integer itemTypeId) {
        this.itemTypeId = itemTypeId;
    }

    public String getItemTypeName() {
        return itemTypeName;
    }

    public void setItemTypeName(String itemTypeName) {
        this.itemTypeName = itemTypeName;
    }

    private String itemName;
    private BigDecimal price;

    private Integer itemTypeId;
    private String itemTypeName;

    public DetailPlayerDTO() {
    }

    public DetailPlayerDTO(Integer playerId, String playerName, String playerNational, String itemId, String itemName, BigDecimal price, Integer itemTypeId, String itemTypeName) {
        this.playerId = playerId;
        this.playerName = playerName;
        this.playerNational = playerNational;
        this.itemId = itemId;
        this.itemName = itemName;
        this.price = price;
        this.itemTypeId = itemTypeId;
        this.itemTypeName = itemTypeName;
    }
}
