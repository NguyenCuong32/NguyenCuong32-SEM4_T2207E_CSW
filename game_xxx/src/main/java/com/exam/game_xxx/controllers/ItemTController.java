package com.exam.game_xxx.controllers;

import com.exam.game_xxx.dtos.ItemTDTO;
import com.exam.game_xxx.models.ItemT;
import com.exam.game_xxx.services.IItemTService;
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
@RequestMapping("/item")
@RequiredArgsConstructor
public class ItemTController {
    private final IItemTService iItemTService;
    @PostMapping("")
    public ResponseEntity<?> createItemT(
            @Valid @RequestBody ItemTDTO itemT,
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
            iItemTService.createItemT(itemT);
            return ResponseEntity.ok("Insert Item T successfully");
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }

    }
}
