package com.t2207e.ExamCSW.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "item_type_t")
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ItemType {
    @Id
    @Column(name = "item_type_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer id;

    @Column(name = "item_type_name", length = 50)
    public String name;
}
