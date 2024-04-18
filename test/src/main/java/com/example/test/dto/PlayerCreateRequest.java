package com.example.test.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PlayerCreateRequest {

    @NotBlank(message = "Player name is required")
    @Size(max = 120, message = "Player name must be less than 120 characters")
    private String playerName;

    @NotBlank(message = "Player national is required")
    @Size(max = 50, message = "Player national must be less than 50 characters")
    private String playerNational;

}
