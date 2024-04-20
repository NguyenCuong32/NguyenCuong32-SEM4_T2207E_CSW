package org.example.game.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Embeddable
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class PlayerItemId implements Serializable {
    @Column(name = "item_id", length = 10)
    private String item_id;

    @Column(name = "player_id")
    private int player_id;
}
