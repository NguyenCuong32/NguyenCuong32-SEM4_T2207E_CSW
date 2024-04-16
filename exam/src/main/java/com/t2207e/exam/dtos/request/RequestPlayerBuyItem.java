package com.t2207e.exam.dtos.request;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class RequestPlayerBuyItem {

    Long playerId;

    String itemId;
}
