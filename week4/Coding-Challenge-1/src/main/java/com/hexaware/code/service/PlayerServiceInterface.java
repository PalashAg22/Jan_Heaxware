package com.hexaware.code.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.hexaware.code.entity.Player;
import com.hexaware.code.repository.PlayerRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class PlayerServiceInterface implements IPlayerService {

	@Autowired
	PlayerRepository playerRepo;
	
	@Override
	public Player createNewPlayer(Player player) {
		// TODO Auto-generated method stub
		return playerRepo.save(player);
	}

	@Override
	public Player updatePlayer(Player player) {
		// TODO Auto-generated method stub
		Player p = playerRepo.findById(player.getPlayerId()).orElse(null);
		p.setCountry(player.getCountry());
		p.setDescription(player.getDescription());
		p.setJerseyNumber(player.getJerseyNumber());
		//p.setPlayerId(player.getCountry());
		p.setPlayerName(player.getPlayerName());
		p.setRole(player.getRole());
		p.setTeamName(player.getTeamName());
		p.setTotalMatches(player.getTotalMatches());
		
		return playerRepo.save(p);
	}

	@Override
	public void deletePlayerById(long playerId) {
		// TODO Auto-generated method stub
		playerRepo.deleteById(playerId);
	}

	@Override
	public List<Player> getAllPlayer() {
		// TODO Auto-generated method stub
		return playerRepo.findAll();
	}

	@Override
	public Player getPlayerById(long playerId) {
		// TODO Auto-generated method stub
		return playerRepo.findById(playerId).orElse(null);
	}

	@Override
	public List<Player> getPlayerByJerseyNumberGreaterThan(int jerseyNumber) {
		// TODO Auto-generated method stub
		return playerRepo.findByjerseyNumGT(jerseyNumber);
	}

	@Override
	public List<Player> getplayerByName(String playerName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Player> getPlayerBetweenMatchesIncluded(int start, int end) {
		// TODO Auto-generated method stub
		return playerRepo.getBetween(start, end);
	}

	@Override
	public List<Player> getPlayerByRole(String role) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Player> getPlayerByJerseyNumber(int jerseyNumber) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deletebyRole(String role) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteByNumberOfMatchesLessThan(int totalMatches) {
		// TODO Auto-generated method stub
		playerRepo.deleteByMatches(totalMatches);
	}

	@Override
	public List<Player> getSortedListByMatches() {
		// TODO Auto-generated method stub
		return playerRepo.findAll(Sort.by("totalMatches"));
	}

	@Override
	public List<Player> orderByjersey() {
		// TODO Auto-generated method stub
		return playerRepo.getPlayerOrderByJersey();
	}
	@Override
	public Player insertPlayer(Player player) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
//	
	@Override
	public List<Object[]> getsortedByCountry() {
		
		return playerRepo.getTwoPro();
	}

	/*
	 * @Override public ArrayList<ArrayList<Object>> orderByCountry() {
	 * 
	 * ArrayList<List<Object>> list = new ArrayList<>();
	 * 
	 * ArrayList<LPlayer> temp = playerRepo.getCountryAsOrderBy();
	 * 
	 * for(Player p : temp) { ArrayList<Object> obj = new ArrayList<>();
	 * obj.add(p.getPlayerName()); obj.add(p.getTotalMatches()); list.add(obj); }
	 * 
	 * 
	 * return list; }
	 */
	
	

	
	
	
}
