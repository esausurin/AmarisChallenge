package com.amaris.challenge.application.rest.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.amaris.challenge.application.rest.dto.ErrorDto;
import com.amaris.challenge.domian.api.exception.BusinessException;
import com.amaris.challenge.domian.api.exception.RequestException;

@RestControllerAdvice
public class ControllerAdvice {
	
	@ExceptionHandler(value=RequestException.class)
	public ResponseEntity<ErrorDto> requestExceptionHandler(RequestException ex){
		ErrorDto error = ErrorDto.builder().code(ex.getCode()).message(ex.getMessage()).build();		
		return new ResponseEntity<>(error,HttpStatus.BAD_REQUEST);		
	}
	
	@ExceptionHandler(value=BusinessException.class)
	public ResponseEntity<ErrorDto> businessExceptionHandler(BusinessException ex){
		ErrorDto error = ErrorDto.builder().code(ex.getCode()).message(ex.getMessage()).build();		
		return new ResponseEntity<>(error,ex.getStatus());		
	}
	
}
