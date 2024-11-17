package com.arcade.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arcade.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}