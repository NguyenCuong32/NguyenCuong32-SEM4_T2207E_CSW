package com.exam.game_xxx.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.math.BigDecimal;

@Entity
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "item_t")
public class ItemT{
    @Id
    @Column(name = "item_id", length = 10)
    private String itemId;

    @Column(name = "item_name", length = 120)
    private String itemName;

    @Column(name = "price", precision = 21, scale = 6)
    private BigDecimal price;

    @ManyToOne
    @JoinColumn(name = "item_type_id")
    private ItemTypeT itemTypeT;

}
