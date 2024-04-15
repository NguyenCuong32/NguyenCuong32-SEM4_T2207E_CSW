package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "player_item_t")
@Getter
@Setter
public class PlayerItem {
    @Id
    @ManyToOne
    @JoinColumn(name = "item_id")
    private Item item;
    @Id
    @ManyToOne
    @JoinColumn(name = "player_id")
    private Player player;
}