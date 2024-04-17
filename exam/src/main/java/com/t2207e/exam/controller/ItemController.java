package com.t2207e.exam.controller;

import com.t2207e.exam.dtos.request.RequestCreateItem;
import com.t2207e.exam.dtos.response.ResponseStatus;
import com.t2207e.exam.service.IItemService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/item")
@RequiredArgsConstructor
public class ItemController {
    final IItemService itemService;

    @PostMapping(value = "")
    public ResponseStatus createItem(@RequestBody @Valid RequestCreateItem request){
        return itemService.create(request);
    }
}
