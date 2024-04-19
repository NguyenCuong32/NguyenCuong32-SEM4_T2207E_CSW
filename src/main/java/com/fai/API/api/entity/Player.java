package com.fai.API.api.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "player_t")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Player {
    @Id
    @Column(name = "player_id")
    private int player_id;

    @NotBlank(message = "Player name is required")
    @Size(max = 120, message = "Player name must be less than 120 characters")
    @Column(name = "item_name")
    private String player_name;

    @NotBlank(message = "Player national is required")
    @Size(max = 50, message = "Player national must be less than 50 characters")
    @Column(name = "player_national")
    private String player_national;

    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(name = "player_item_t", joinColumns = @JoinColumn(name = "player_id"),
            inverseJoinColumns = @JoinColumn(name = "item_id"))
    private List<ItemT> items;

    public Player(Integer playerId, String playerName, String playerNational, String itemName, BigDecimal bigDecimal, String itemTypeName) {
    }


    @Override
    public String toString() {
        return "Player{" +
                "player_id=" + player_id +
                ", item_name='" + player_name + '\'' +
                ", player_national='" + player_national + '\'' +
                '}';
    }

}
