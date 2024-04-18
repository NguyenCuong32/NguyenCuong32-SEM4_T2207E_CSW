package com.example.test.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.NamedStoredProcedureQuery;
import lombok.*;

import java.math.BigDecimal;

//@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PlayerInfo {

//    @Id
//    private String infoId;

    private Integer playerId;

    private String playerName;

    private String playerNational;

    private String itemName;

    private BigDecimal price;

    private String itemTypeName;

}
