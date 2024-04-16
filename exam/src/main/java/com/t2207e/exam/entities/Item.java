package com.t2207e.exam.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "item_t")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Item {
    @Id
    @Column(name = "item_id")
    String itemId;

    @Column(name = "item_name")
    String itemName;

    @ManyToOne
    @JoinColumn(name = "item_type_id")
    ItemType itemType;

    @Column(name = "price")
    BigDecimal price;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(
            name = "player_item_t",
            joinColumns = @JoinColumn(name = "item_id"),
            inverseJoinColumns = @JoinColumn(name = "player_id")
    )
    private List<Player> players;


}
