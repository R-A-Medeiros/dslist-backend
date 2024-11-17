package com.arcade.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arcade.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{

}
