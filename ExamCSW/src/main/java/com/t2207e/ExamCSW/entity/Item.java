package com.t2207e.ExamCSW.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "item_t")
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Item {
    @Id
    @Column(name = "item_id",length = 10)
    public String id;

    @Column(name = "item_name ",length = 120)
    public String name;

    @ManyToOne
    @JoinColumn(name = "item_type_id")
    public ItemType itemType;

    @Column(name = "price")
    public Double price;
}
