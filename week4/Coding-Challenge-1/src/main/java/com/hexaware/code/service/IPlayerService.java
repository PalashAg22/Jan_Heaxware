package com.hexaware.code.service;

import java.util.ArrayList;
import java.util.List;

import com.hexaware.code.entity.Player;

public interface IPlayerService {

	public Player createNewPlayer(Player player);
	
	public Player updatePlayer(Player player);
	
	public void deletePlayerById(long playerId);
	
	public List<Player> getAllPlayer();
	
	public Player getPlayerById(long playerId);
	
	public List<Player> getPlayerByJerseyNumberGreaterThan(int jerseyNumber);
	
	public List<Player> getplayerByName(String playerName);
	 
	public List<Player> getPlayerBetweenMatchesIncluded(int start, int end);
	
	public List<Player> getPlayerByRole(String role);
	
	public List<Player> getPlayerByJerseyNumber(int jerseyNumber);
	
	public List<Player> getSortedListByMatches();
	
	public void deletebyRole(String role);
	
	public void deleteByNumberOfMatchesLessThan(int totalMatches);
	
	public List<Player> orderByjersey();
	
	public Player insertPlayer(Player player);	
	
	public List<Object[]> getsortedByCountry();
	
	//public ArrayList<ArrayList<Object>> orderByCountry();
	
}
