package com.hexaware.code.exception;

import org.jboss.logging.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class PlayerExceptionHandler {

	Logger log = Logger.getLogger(PlayerExceptionHandler.class);
	
	
	@ResponseStatus(value=HttpStatus.BAD_REQUEST, reason="player not found")
	@ExceptionHandler({PlayerIdNotFoundException.class})
	public void idNotFound() {
		log.warn("entered player is not matched with database");
	}
	
	
	@ExceptionHandler({PlayerNameNotFound.class})
	public ResponseEntity<String> nameNoFound(){
		log.warn("entered player name has no match in db");
		return new ResponseEntity<String>("invalid player name",HttpStatus.BAD_REQUEST );
		
	}
	
	@ResponseStatus(value=HttpStatus.BAD_REQUEST, reason="player not found")
	@ExceptionHandler({PlayerRoleNotFound.class})
	public ResponseEntity<String> roleNotFound(){
		return new ResponseEntity<String>("entered role is invalid",HttpStatus.NOT_FOUND);
	}
	
	@ResponseStatus(value=HttpStatus.ALREADY_REPORTED, reason="player already exixts")
	@ExceptionHandler({PlayerAlreadyExixts.class})
	public void already() {
		
	}
}
