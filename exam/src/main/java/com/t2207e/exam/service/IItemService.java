package com.t2207e.exam.service;
import com.t2207e.exam.dtos.request.RequestCreateItem;
import org.springframework.stereotype.Service;
import com.t2207e.exam.dtos.response.ResponseStatus;

@Service
public interface IItemService {
    ResponseStatus create(RequestCreateItem createItem);
}

