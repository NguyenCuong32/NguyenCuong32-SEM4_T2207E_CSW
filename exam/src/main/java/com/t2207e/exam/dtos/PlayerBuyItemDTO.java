package com.t2207e.exam.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class PlayerBuyItemDTO {
    Long playerId;
    String playerName;
    String playerNational;
    String itemName;
    BigDecimal price;
    String itemType;
}
