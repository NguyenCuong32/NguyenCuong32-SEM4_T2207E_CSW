package com.fai.API.api.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.math.BigDecimal;

@Entity
@Table(name = "item_t")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ItemT {
    @Id
    @Column(name = "item_id", nullable = false, length = 10)
    private String itemId;

    @NotBlank(message = "Item name is required")
    @Size(max = 255, message = "Item name must be less than 255 characters")
    @Column(name = "item_name", length = 120)
    private String itemName;

    @ManyToOne
    @JoinColumn(name = "item_type_id")
    @NotNull(message = "Item type id is required")
    private ItemTypeT itemTypeId;

    @DecimalMin(value = "0.0", inclusive = false, message = "Price must be greater than 0")
    @Column(name = "price", precision = 21, scale = 6)
    private BigDecimal price;


}