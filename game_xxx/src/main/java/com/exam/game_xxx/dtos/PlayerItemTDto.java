package com.exam.game_xxx.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.*;

import java.io.Serializable;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Embeddable
public class PlayerItemTDto implements Serializable {
    @JsonProperty("item_id")
    @Column(name = "item_id")
    private String itemId;

    @JsonProperty("player_id")
    @Column(name = "player_id")
    private int playerId;
}
