package com.hexaware.code.controller;

import java.util.List;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.code.entity.Player;
import com.hexaware.code.exception.PlayerAlreadyExixts;
import com.hexaware.code.exception.PlayerIdNotFoundException;
import com.hexaware.code.repository.PlayerRepository;
import com.hexaware.code.service.IPlayerService;

import jakarta.validation.Valid;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/api")
public class PlayerRestController {

	Logger logg = Logger.getLogger(PlayerRestController.class);
	
	@Autowired
	PlayerRepository repo;
	
	@Autowired
	IPlayerService service;
	
	
	@PostMapping(value="/player",consumes = "application/json", produces = "application/json")
	public Player addPlayer(@RequestBody @Valid Player player) throws PlayerAlreadyExixts {
		return service.createNewPlayer(player);
	}
	
	@PutMapping("/update")
	public Player updatePlayerInfo(@RequestBody @Valid Player player) {
		return service.updatePlayer(player);
	}
	
	@GetMapping("/getAll")
	public List<Player> findAllPlayer(){
		return service.getAllPlayer();
	}
	
	@GetMapping("/getById/{PlayerId}")
	public Player findPlayerById(@PathVariable long playerId) throws PlayerIdNotFoundException {
		
		Player player =  service.getPlayerById(playerId);
		if( player == null) {
			throw new PlayerIdNotFoundException();
		}
		return player;
	}
	
	@DeleteMapping(value="/delete/{playerId}")
	public boolean deleteById(@PathVariable long playerId) throws PlayerIdNotFoundException {
		logg.info("deleting....");
		Player player =  service.getPlayerById(playerId);
		boolean f = true;
		if( player == null) {
			f = false;
			//throw new PlayerIdNotFoundException();
		}
		logg.warn("deleteing player with Id"+ playerId +"..");
		service.deletePlayerById(playerId);
		return f;
	}
	
	@GetMapping("/getJerseyGT/{jerseyNumber}")
	public List<Player> getByjerseyNumberGT(@PathVariable int jerseyNumber){
		return service.getPlayerByJerseyNumberGreaterThan(jerseyNumber);
	}
	
	@GetMapping("/getbewtween/{start}/{end}")
	public List<Player> getBetweenMatches(@PathVariable int start, @PathVariable int end){
		return service.getPlayerBetweenMatchesIncluded(start, end);
	}
	
	@GetMapping("/sorted")
	public List<Player> getSortedBymatches(){
		return service.getSortedListByMatches(); // findAll(Sort.By(Order.desc("totalMatches"));
	}
	
	
	@DeleteMapping("/deleteByNumOfMatches/{totalMatches}")
	public void deleteByNumOfMatches(@PathVariable int totalMatches) {
		service.deleteByNumberOfMatchesLessThan(totalMatches);
	}
	@GetMapping("/orderBy")
	public List<Player> getOrderByJerseyNum(){
		return service.orderByjersey();
	}
	
	@GetMapping("/displayName&Matches")
	public List<Object[]> orderByCountry(){
		return service.getsortedByCountry();
	}
	
	
	
	
	@GetMapping("/sortedByCountry")
	public List<Object[]> sortByCoountry(){
		return repo.getTwoPro();
	}
	
	
	
	
}
