package org.example.csw.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "item_type_t")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ItemType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "item_type_id")
    private int itemTypeId;

    @Column(name = "item_type_name")
    private String itemTypeName;

}
