package com.exam.game_xxx.dtos;

import com.exam.game_xxx.models.ItemTypeT;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.math.BigDecimal;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ItemTDTO {
    private String itemId;

    private String itemName;

    private BigDecimal price;

    @JsonProperty("item_type_id")
    private int itemTypeTId;
}
