package com.t2207e.exam.services;

import com.t2207e.exam.dtos.request.RequestCreateItem;
import com.t2207e.exam.dtos.response.ResponseStatus;
import org.springframework.stereotype.Service;

@Service
public interface IItemService {

    ResponseStatus create(RequestCreateItem createItem);
}
