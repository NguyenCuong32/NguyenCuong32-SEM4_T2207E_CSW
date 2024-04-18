package com.example.demoapi.controller;

import com.example.demoapi.entity.ResponseObject;
import com.example.demoapi.entity.itemplayer;
import com.example.demoapi.services.itemplayerservice;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping()
public class equipmentController {
 private final itemplayerservice itemplayerservice;

    public equipmentController(com.example.demoapi.services.itemplayerservice itemplayerservice) {
        this.itemplayerservice = itemplayerservice;
    }

    @PostMapping("/playerbuyitem")
    public ResponseEntity<ResponseObject> addequipment(@RequestBody itemplayer request){
        itemplayerservice.buyitem(request.getItemId(), request.getPlayerId());
        int errorCode = HttpStatus.OK.value();
        String errorCodeString = Integer.toString(errorCode);
        return ResponseEntity.status(HttpStatus.OK).body(
                new ResponseObject("True",errorCodeString)
        );
    }

}
