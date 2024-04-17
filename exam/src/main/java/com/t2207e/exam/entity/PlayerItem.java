package com.t2207e.exam.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "play_item_t")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PlayerItem {
    @Id
    @ManyToOne
    @JoinColumn(name = "item_id")
    private Item item;

    @Id
    @ManyToOne
    @JoinColumn(name = "player_id")
    private  Player player;
}
