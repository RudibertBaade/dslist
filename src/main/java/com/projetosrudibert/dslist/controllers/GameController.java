package com.projetosrudibert.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projetosrudibert.dslist.dto.GameMinDTO;
import com.projetosrudibert.dslist.entities.Game;
import com.projetosrudibert.dslist.services.GameService;

@RestController
@RequestMapping(value = "/games")
public class GameController {
	
	@Autowired
	private GameService gameService;
	
	@GetMapping
	public List<GameMinDTO> FindAll() {
		List<GameMinDTO> result = gameService.FindAll();
		return result;
		
	}
	

}
