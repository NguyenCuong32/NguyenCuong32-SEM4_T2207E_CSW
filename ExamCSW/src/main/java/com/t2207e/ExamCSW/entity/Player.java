package com.t2207e.ExamCSW.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "player_t")
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Player {
    @Id
    @Column(name = "player_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer id;

    @Column(name = "player_name",length = 120)
    public String name;

    @Column(name = "player_national",length = 50)
    public String national;

}
