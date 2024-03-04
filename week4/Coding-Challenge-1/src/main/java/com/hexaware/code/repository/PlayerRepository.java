package com.hexaware.code.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hexaware.code.entity.Player;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Long>{

	@Query("select p from Player p where p.jerseyNumber> ?1")
	List<Player> findByjerseyNumGT(int jerseyNumber);
	
	@Modifying
	@Query(value = "delete from player_table pt where pt.total_matches < ?",
			nativeQuery=true)
	void deleteByMatches(int totalMatches);
	
	@Query("select p from Player p where p.totalMatches BETWEEN ?1 and ?2")
	List<Player> getBetween(int start, int end);
	
	@Query("select p from Player p Order By p.jerseyNumber ASC")
	List<Player> getPlayerOrderByJersey();
	
	
	@Query(value="select p.playerName, p.totalMatches, p.country from Player as p Order By p.country ASC")	
	List<Object[]> getTwoPro();
	
	
	@Query(value="select pt.player_name from player_table pt Order By pt.country ASC"
			, nativeQuery=true)
	List<ArrayList<Player>> getCountryAsOrderBy();
	
	
	
	
	
}
