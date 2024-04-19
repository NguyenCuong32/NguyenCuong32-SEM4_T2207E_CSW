package com.t2207e.ExamCSW.reponsitory;

import com.t2207e.ExamCSW.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IItemReponsitory extends JpaRepository<Item,String> {
}
