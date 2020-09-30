package br.com.fiap.mba.bookstore.handler;

import br.com.fiap.mba.bookstore.dto.DetailsErro;
import br.com.fiap.mba.bookstore.exceptions.BookNotFound;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class ResourceExceptionHandler {

	@ExceptionHandler(BookNotFound.class)
	public ResponseEntity<DetailsErro> handlerLoginNaoEncontradoException(BookNotFound e,
																		  HttpServletRequest request){
		DetailsErro erro = new DetailsErro("Book not found", 404L, System.currentTimeMillis());
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(erro);
	}
}
