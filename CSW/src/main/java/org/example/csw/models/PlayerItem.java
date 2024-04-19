package org.example.csw.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;
import java.io.Serializable;

@Entity
@Table(name = "player_item_t")
@IdClass(PlayerItem.PlayerItemId.class)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PlayerItem {
    @Id
    @ManyToOne
    @JoinColumn(name = "item_id", foreignKey = @ForeignKey(name = "FK_PlayerItem_ItemTable"))
    private Item item;
    @Id
    @ManyToOne
    @JoinColumn(name = "player_id", foreignKey = @ForeignKey(name = "FK_PlayerItem_PlayerTable"))
    private Player player;

    // Composite key class

    public class PlayerItemId implements Serializable {
        private String item;
        private int player;
    }
}
