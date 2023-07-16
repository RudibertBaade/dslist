package com.projetosrudibert.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetosrudibert.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}
