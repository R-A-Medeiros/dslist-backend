package com.arcade.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.arcade.dslist.dto.GameDTO;
import com.arcade.dslist.dto.GameMinDTO;
import com.arcade.dslist.repositories.GameRepository;

@Service
public class GameService {

	@Autowired
	private GameRepository gameRepository;
	
	@Transactional(readOnly = true)
	public GameDTO findById(Long id) {
		var result = gameRepository.findById(id).get();
		return new GameDTO(result);
	}
	
	@Transactional(readOnly = true)
	public List<GameMinDTO> findAll() {
		var result = gameRepository.findAll();
		var dto = result.stream().map(x -> new GameMinDTO(x)).toList()
;		return dto;
	}
}
