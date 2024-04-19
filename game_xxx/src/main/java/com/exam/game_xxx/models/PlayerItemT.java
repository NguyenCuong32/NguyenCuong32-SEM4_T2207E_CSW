package com.exam.game_xxx.models;

import com.exam.game_xxx.dtos.PlayerItemTDto;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "player_item_t")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@IdClass(PlayerItemTDto.class)
public class PlayerItemT {

    @Id
    @Column(name = "item_id")
    private String itemId;

    @Id
    @Column(name = "player_id")
    private Integer playerId;

    @ManyToOne
    @JoinColumn(name = "item_id", referencedColumnName = "item_id", insertable = false, updatable = false)
    private ItemT itemT;

    @ManyToOne
    @JoinColumn(name = "player_id", referencedColumnName = "player_id", insertable = false, updatable = false)
    private PlayerT playerT;
}

