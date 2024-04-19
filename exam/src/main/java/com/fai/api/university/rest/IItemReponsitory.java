package com.fai.api.university.rest;

import com.fai.api.university.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;


    public interface IItemReponsitory  extends JpaRepository<Item,String> {
    }

