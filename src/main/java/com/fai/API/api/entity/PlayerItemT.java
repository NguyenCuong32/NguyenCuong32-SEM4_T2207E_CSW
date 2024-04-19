package com.fai.API.api.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "player_item_t")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PlayerItemT {
    @EmbeddedId
    private PlayerItemTId id;

    @MapsId("itemId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "item_id", nullable = false)
    private ItemT item;

    @MapsId("playerId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "player_id", nullable = false)
    private Player player;


}