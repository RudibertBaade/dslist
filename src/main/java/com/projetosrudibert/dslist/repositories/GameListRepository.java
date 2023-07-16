package com.projetosrudibert.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetosrudibert.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{

}
