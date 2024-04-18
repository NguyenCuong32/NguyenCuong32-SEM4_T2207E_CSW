package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "item_type_t")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ItemType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer itemTypeId;

    private String itemTypeName;

    @OneToMany(mappedBy = "itemType", cascade = CascadeType.ALL)
    private List<Item> items;

}