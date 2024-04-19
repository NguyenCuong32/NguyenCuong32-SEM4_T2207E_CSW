package org.example.csw.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Entity
@Table(name = "item_t")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Item {
    @Id
    @Column(name = "item_id")
    private String itemId;

    @Column(name = "item_name")
    private String itemName;
    @ManyToOne
    @JoinColumn(name = "item_type_id", foreignKey = @ForeignKey(name = "FK_ItemTable_ItemTypeTable"))
    private ItemType itemType;

    @Column(name = "price")
    private BigDecimal price;


}
