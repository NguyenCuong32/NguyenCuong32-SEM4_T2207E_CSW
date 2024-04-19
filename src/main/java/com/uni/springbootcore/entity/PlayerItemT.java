package com.uni.springbootcore.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "player_item_t")
public class PlayerItemT {
    @EmbeddedId
    private PlayerItemTId id;

    @MapsId("itemId")
    @ManyToOne(optional = false)
    @JoinColumn(name = "item_id", nullable = false)
    private ItemT item;

    @MapsId("playerId")
    @ManyToOne(optional = false)
    @JoinColumn(name = "player_id", nullable = false)
    private PlayerT player;

    public PlayerItemTId getId() {
        return id;
    }

    public void setId(PlayerItemTId id) {
        this.id = id;
    }

    public ItemT getItem() {
        return item;
    }

    public void setItem(ItemT item) {
        this.item = item;
    }

    public PlayerT getPlayer() {
        return player;
    }

    public void setPlayer(PlayerT player) {
        this.player = player;
    }

}