package com.example.demoapi.controller;

import com.example.demoapi.entity.ResponseObject;
import com.example.demoapi.entity.items;
import com.example.demoapi.services.itemservice;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping()
public class itemcontroller {

    private final itemservice itemservice;

    public itemcontroller(com.example.demoapi.services.itemservice itemservice) {
        this.itemservice = itemservice;
    }

@PostMapping("/item")
//    @ResponseStatus(code = HttpStatus.OK, reason = "OK")
public ResponseEntity<ResponseObject> insertitem(@RequestBody items items){
    int errorCode = HttpStatus.OK.value();
String errorCodeString = Integer.toString(errorCode);
    return ResponseEntity.status(HttpStatus.OK).body(
            new ResponseObject("True", errorCodeString )
    );

//    return ResponseEntity.status(HttpStatus.OK).body(
//                new ResponseObject("True", errorCode  ,  itemservice.createitem(items))
//        );
}

}
