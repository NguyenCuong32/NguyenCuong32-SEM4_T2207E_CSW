package org.example.game.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "player_item_t")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class PlayerItem {
    @EmbeddedId
    private PlayerItemId id;

    @ManyToOne
    @MapsId("player_id")
    @JoinColumn(name = "player_id")
    private Player player;

    @ManyToOne
    @MapsId("item_id")
    @JoinColumn(name = "item_id")
    private Item item;
}
