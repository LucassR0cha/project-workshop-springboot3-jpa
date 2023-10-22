package com.protxprts.demo.resources.exceptions;

import java.time.Instant;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.protxprts.demo.services.exceptions.DatabaseException;
import com.protxprts.demo.services.exceptions.ResourceNotFoundException;

import jakarta.servlet.http.HttpServletRequest;

@ControllerAdvice
public class ResourceExceptionHandler {

	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<StandardError> resourceNotFound(ResourceNotFoundException e, HttpServletRequest request) {

		String error = "Recurso não encontrado";
		HttpStatus status = HttpStatus.NOT_FOUND;
		StandardError str = new StandardError(Instant.now(), status.value(), error, e.getMessage(),
				request.getRequestURI());

		return ResponseEntity.status(status).body(str);
	}
	
	@ExceptionHandler(DatabaseException.class)
	public ResponseEntity<StandardError> database(DatabaseException e, HttpServletRequest request) {

		String error = "Erro no Banco de Dados";
		HttpStatus status = HttpStatus.BAD_REQUEST;
		StandardError str = new StandardError(Instant.now(), status.value(), error, e.getMessage(),
				request.getRequestURI());

		return ResponseEntity.status(status).body(str);
	}
}
