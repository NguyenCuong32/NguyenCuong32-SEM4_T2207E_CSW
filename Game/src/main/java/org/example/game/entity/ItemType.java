package org.example.game.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "item_type_t")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class ItemType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "item_type_id")
    private int item_type_id;

    @Column(name = "item_type_name")
    private String  item_type_name;

    @OneToMany(mappedBy = "itemType")
    private List<Item> items;
}
