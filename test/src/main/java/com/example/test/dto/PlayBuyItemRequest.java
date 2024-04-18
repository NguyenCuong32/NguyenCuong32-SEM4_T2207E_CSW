package com.example.test.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PlayBuyItemRequest {

    @NotNull(message = "Player ID cannot be empty")
    private Integer playerId;

    @NotBlank(message = "Item ID cannot be empty")
    private String itemId;

}
