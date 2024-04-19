package com.exam.game_xxx.controllers;

import com.exam.game_xxx.dtos.ItemTDTO;
import com.exam.game_xxx.dtos.PlayerTDto;
import com.exam.game_xxx.services.IPlayerTService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("/player")
public class PlayerTController {
    private final IPlayerTService iPlayerTService;
    @PostMapping("")
    public ResponseEntity<?> createPlayerT(
            @Valid @RequestBody PlayerTDto playerTDto,
            BindingResult result
    ){
        try {
            if(result.hasErrors()) {
                List<String> errorMessages = result.getFieldErrors()
                        .stream()
                        .map(FieldError::getDefaultMessage)
                        .toList();
                return ResponseEntity.badRequest().body(errorMessages);
            }
            iPlayerTService.createPlayerT(playerTDto);
            return ResponseEntity.ok("Insert player T successfully");
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }

    }
}
