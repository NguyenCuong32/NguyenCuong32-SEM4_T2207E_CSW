package com.t2207e.ExamCSW.entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "player_item_t")
public class PlayerItem {

    @EmbeddedId
    private PlayerItemId id;

    @ManyToOne
    @MapsId("itemId")
    @JoinColumn(name = "item_id")
    private Item item;

    @ManyToOne
    @MapsId("playerId")
    @JoinColumn(name = "player_id")
    private Player player;

    // Getters and setters

    public PlayerItemId getId() {
        return id;
    }

    public void setId(PlayerItemId id) {
        this.id = id;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    @Embeddable
    public static class PlayerItemId implements Serializable {

        @Column(name = "item_id")
        private String itemId;

        @Column(name = "player_id")
        private Integer playerId;

        // Getters and setters
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

        // Equals and HashCode
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            PlayerItemId that = (PlayerItemId) o;
            return Objects.equals(itemId, that.itemId) &&
                    Objects.equals(playerId, that.playerId);
        }

        @Override
        public int hashCode() {
            return Objects.hash(itemId, playerId);
        }
    }
}