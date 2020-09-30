package br.com.fiap.mba.bookstore.exceptions;

public class BookNotFound  extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public BookNotFound(String mensage) {
        super();
    }

    public BookNotFound(String mensage, Throwable cause) {
        super(mensage, cause);
    }
}