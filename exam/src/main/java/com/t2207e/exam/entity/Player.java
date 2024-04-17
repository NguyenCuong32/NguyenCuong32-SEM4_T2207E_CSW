package com.t2207e.exam.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "play_t")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "player_ID")
    private Long playerId;
    @Column(name = "player_name")
    private String playerName;
    @Column(name = "player_national")
    private String playerNational;

    private List<Item> items;
    }



