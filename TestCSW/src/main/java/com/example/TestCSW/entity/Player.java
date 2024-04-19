package com.example.TestCSW.entity;

import jakarta.persistence.*;

@Entity
@Table(name="player_t")
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="player_id")
    private Integer id;
    @Column(name="player_name")
    private String name;
    @Column(name="player_national")
    private String national;

    public Player() {
    }

    public Player(Integer id, String name, String national) {
        this.id = id;
        this.name = name;
        this.national = national;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNational() {
        return national;
    }

    public void setNational(String national) {
        this.national = national;
    }
}
