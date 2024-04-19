package com.exam.game_xxx.dtos;

import jakarta.validation.constraints.Size;
import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PlayerTDto {
    @Size(max = 120, message = "Name must 120 characters")
    private String playerName;
    @Size(max = 50, message = "Name must 50 characters")
    private String playerNational;
}
