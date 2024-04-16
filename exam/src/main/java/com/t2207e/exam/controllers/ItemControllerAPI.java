package com.t2207e.exam.controllers;

import com.t2207e.exam.dtos.request.RequestCreateItem;
import com.t2207e.exam.dtos.response.ResponseStatus;
import com.t2207e.exam.services.IItemService;
import jakarta.validation.Valid;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/item")
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ItemControllerAPI {

    final IItemService itemService;

    @PostMapping(value = "")
    public ResponseStatus createItem(@RequestBody @Valid RequestCreateItem request){
        return itemService.create(request);
    }
}
