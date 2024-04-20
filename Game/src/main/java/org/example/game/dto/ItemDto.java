package org.example.game.dto;

import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ItemDto {
    private String item_id;
    private String item_name;
    private int item_type_id;
    private BigDecimal price;
}
