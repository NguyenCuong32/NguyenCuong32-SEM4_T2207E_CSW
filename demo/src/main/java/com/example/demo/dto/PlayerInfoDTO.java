package com.example.demo.dto;

import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PlayerInfoDTO {
    private Integer playerId;

    private String playerName;

    private String playerNational;

    private String itemName;

    private BigDecimal price;

    private String itemTypeName;
}
