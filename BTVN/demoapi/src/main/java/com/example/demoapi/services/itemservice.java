package com.example.demoapi.services;

import com.example.demoapi.entity.items;
import com.example.demoapi.repository.itemRepository;
import org.springframework.stereotype.Service;

@Service
public class itemservice {
    private final itemRepository itemRepository;

    public itemservice(com.example.demoapi.repository.itemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    public items createitem(items items) {

      return  itemRepository.save(items);
    }


}
