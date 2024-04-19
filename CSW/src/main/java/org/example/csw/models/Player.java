package org.example.csw.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "player_t")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "player_id")
    private int playerId;

    @Column(name = "player_name")
    private String playerName;

    @Column(name = "player_national")
    private String playerNational;

}
