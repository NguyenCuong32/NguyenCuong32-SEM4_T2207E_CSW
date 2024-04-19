package com.fai.api.university.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "item_type_t")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ItemType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "item_type_id")
    private Integer itemtypeid;
    @Column(name = "item_type_name")
    private String name;
}