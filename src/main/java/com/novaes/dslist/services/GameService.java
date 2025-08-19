package com.novaes.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.novaes.dslist.dto.GameDTO;
import com.novaes.dslist.dto.GameMinDTO;
import com.novaes.dslist.entities.Game;
import com.novaes.dslist.repositories.GameRepository;

@Service
public class GameService {
 
	@Autowired
	private GameRepository gameRepository;
	
	@Transactional(readOnly = true)
	public GameDTO findById(Long id) {
		Game result = gameRepository.findById(id).get(); //Incluir tratamento de exceção
		return new GameDTO(result);
	}
	
	@Transactional(readOnly = true)
	public List<GameMinDTO> findAll() {
		List<Game> result = gameRepository.findAll();
		return result.stream().map(x -> new GameMinDTO(x)).toList();
	}
}
