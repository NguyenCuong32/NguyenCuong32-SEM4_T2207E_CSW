package com.fai.api.university.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "player_t")
@Getter
@Setter
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "player_id")
    private Integer playerId;
    @Column(name = "player_name")
    private String name;
    @Column(name = "player_national")
    private String national;
}