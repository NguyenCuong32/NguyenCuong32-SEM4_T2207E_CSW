package com.example.test.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "item_t")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Item {

    @Id
    private String itemId;

    private String itemName;

    @ManyToOne
    @JoinColumn(name = "item_type_id")
    private ItemType itemType;

    private BigDecimal price;

    @ManyToMany(mappedBy = "items", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private List<Player> players;

}
