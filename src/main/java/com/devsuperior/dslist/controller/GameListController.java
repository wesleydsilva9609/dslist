package com.devsuperior.dslist.controller;

import com.devsuperior.dslist.dto.GameListDTO;
import com.devsuperior.dslist.dto.GameMinDTO;
import com.devsuperior.dslist.service.GameListService;
import com.devsuperior.dslist.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/lists")
public class GameListController {
    @Autowired
    private GameListService service;
    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameListDTO> findall(){
        return service.findall();
    }

    @GetMapping("/{listId}/games")
    public List<GameMinDTO> findbylist(@PathVariable Long listId){
        return gameService.searchById(listId);
    }
}
