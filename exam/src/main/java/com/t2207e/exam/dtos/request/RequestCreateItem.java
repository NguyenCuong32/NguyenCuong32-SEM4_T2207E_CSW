package com.t2207e.exam.dtos.request;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;

@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class RequestCreateItem {

    String itemName;

    int itemType;

    BigDecimal price;
}
