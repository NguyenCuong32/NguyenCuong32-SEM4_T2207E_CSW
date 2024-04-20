package org.example.game.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "player_t")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "player_id")
    private int player_id;

    @Column(name = "player_name", length = 120)
    private String player_name;

    @Column(name = "player_national", length = 50)
    private String player_national;
}
