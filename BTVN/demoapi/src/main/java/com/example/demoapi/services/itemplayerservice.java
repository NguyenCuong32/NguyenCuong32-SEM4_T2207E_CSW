package com.example.demoapi.services;

import com.example.demoapi.entity.items;
import com.example.demoapi.entity.players;
import com.example.demoapi.exception.notfoundexception;
import com.example.demoapi.repository.itemRepository;
import com.example.demoapi.repository.playerRepository;
import org.hibernate.annotations.NotFound;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class itemplayerservice {
    private final itemRepository itemrepository;

    private final playerRepository playerrepository;



    public itemplayerservice(itemRepository itemrepository, playerRepository playerrepository) {
        this.itemrepository = itemrepository;
        this.playerrepository = playerrepository;
    }

    public void buyitem(String itemid, Integer playerid){
        try {

            players player = playerrepository.findById(playerid).get();
             items items = itemrepository.findById(itemid).get();
            player.getItemofplayer().add(items);
            playerrepository.save(player);
        }
        catch(Exception e){
            throw  new notfoundexception("player or item not found, or item already owned by the player");
        }

    }
}
