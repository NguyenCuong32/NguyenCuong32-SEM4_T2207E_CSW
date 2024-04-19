package com.fai.API.api.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import org.hibernate.Hibernate;

import java.util.Objects;

@Embeddable
public class PlayerItemTId implements java.io.Serializable {
    private static final long serialVersionUID = 109394458969430652L;
    @Column(name = "item_id", nullable = false, length = 10)
    private String itemId;

    @Column(name = "player_id", nullable = false)
    private Integer playerId;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        PlayerItemTId entity = (PlayerItemTId) o;
        return Objects.equals(this.itemId, entity.itemId) &&
                Objects.equals(this.playerId, entity.playerId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(itemId, playerId);
    }

}