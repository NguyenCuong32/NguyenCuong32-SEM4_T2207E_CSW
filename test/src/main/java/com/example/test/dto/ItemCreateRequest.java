package com.example.test.dto;

import com.example.test.entity.ItemType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ItemCreateRequest {

    @NotBlank(message = "Item name is required")
    @Size(max = 255, message = "Item name must be less than 255 characters")
    private String itemName;

    @NotNull(message = "Item type id is required")
    private Integer itemTypeId;

    @DecimalMin(value = "0.0", inclusive = false, message = "Price must be greater than 0")
    private BigDecimal price;

}
