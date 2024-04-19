package com.exam.game_xxx.controllers;

import com.exam.game_xxx.dtos.ItemTDTO;
import com.exam.game_xxx.dtos.PlayerItemTDto;
import com.exam.game_xxx.services.IPlayerItemService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/playerbuyitem")
@RequiredArgsConstructor
public class PlayerItemTController {
    private final IPlayerItemService iPlayerItemService;

    @PostMapping("")
    public ResponseEntity<?> createPlaterItemT(
            @Valid @RequestBody PlayerItemTDto playerItemTDto,
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
            iPlayerItemService.createPlayerItemT(playerItemTDto);
            return ResponseEntity.ok("Insert Player Item T successfully");
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }

    }
}
