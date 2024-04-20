package org.example.game.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Entity
@Table(name = "item_t")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Item {
    @Id
    @Column(name = "item_id", length = 36)
    private String item_id;

    @Column(name = "item_name", length = 120)
    private String item_name;

    @ManyToOne(cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE,
            CascadeType.DETACH,
            CascadeType.REFRESH
    })
    @JoinColumn(name = "item_type_id")
    private ItemType itemType;

    @Column(name = "price", precision = 21, scale = 6)
    private BigDecimal price;
}

