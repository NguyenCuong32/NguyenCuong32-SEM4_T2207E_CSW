package com.t2207e.exam.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Entity
@Table(name = "item_type_t")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ItemType {

    @Id
    @Column(name = "item_type_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int itemTypeId;

    @Column(name = "item_type_name")
    String itemTypeName;

    @OneToMany(mappedBy = "itemType", fetch = FetchType.LAZY)
    private List<Item> items;

}
