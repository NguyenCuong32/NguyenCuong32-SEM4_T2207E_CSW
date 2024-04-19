package com.exam.game_xxx.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.*;

@Entity
@Table(name = "item_type_t")
@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ItemTypeT {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "item_type_id")
    private int itemTypeId;

    @Column(name = "item_type_name")
    @Size(max = 50, message = "Name must 50 characters")
    private String itemTypeName;
}
