package com.devsuperior.movieflix.resources.exceptions;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.devsuperior.movieflix.services.exceptions.UnauthorizedException;

@ControllerAdvice
public class ResourceExceptionHandler {
	

	//erro n: 401
	@ExceptionHandler(UnauthorizedException.class)
	public ResponseEntity<OAuthCustomError> Unauthorized(UnauthorizedException e, HttpServletRequest request){
		
		OAuthCustomError err = new OAuthCustomError("Unauthorized", e.getMessage());	
		return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(err);
		
	}

}
