package com.novaes.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.novaes.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
