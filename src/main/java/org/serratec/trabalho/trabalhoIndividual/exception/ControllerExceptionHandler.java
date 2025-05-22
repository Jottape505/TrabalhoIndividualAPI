package org.serratec.trabalho.trabalhoIndividual.exception;


import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class ControllerExceptionHandler extends ResponseEntityExceptionHandler {
	
	@Override
	protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
			HttpHeaders headers, HttpStatusCode status, WebRequest request) {
		
		List<String> erros = new ArrayList<>();
		for(FieldError er: ex.getBindingResult().getFieldErrors()) {
			erros.add(er.getField() + ": " + er.getDefaultMessage());
		}
		
		return super.handleExceptionInternal(ex, erros, headers, status, request);
	}

	 @ExceptionHandler(Exception.class)
	    public ResponseEntity<ErroResposta> handleGeneric(Exception ex) {
	        ErroResposta resposta = new ErroResposta(LocalDateTime.now(), HttpStatus.INTERNAL_SERVER_ERROR.value(), ex.getMessage(), "/funcionarios");
	        return new ResponseEntity<>(resposta, HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	
}
