package com.exam.game_xxx.models;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.*;

import java.io.Serializable;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class PlayerItemId implements Serializable {
    @Column(name = "item_id")
    private String itemId;
    @Column(name = "player_id")
    private Integer playerId;
}
