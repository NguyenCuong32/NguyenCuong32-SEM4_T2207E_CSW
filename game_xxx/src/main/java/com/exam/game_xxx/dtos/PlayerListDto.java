package com.exam.game_xxx.dtos;

import lombok.*;

import java.math.BigDecimal;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PlayerListDto {
    private Integer playerId;
    private String playerName;
    private String playerNational;
    private String itemName;
    private BigDecimal price;
    private String itemTypeName;

}
