package br.com.fiap.mba.bookstore.service;

import br.com.fiap.mba.bookstore.entity.Book;
import br.com.fiap.mba.bookstore.dto.BookDto;

import java.util.List;

public interface BookService {

    List<Book> findall();

    Book create(BookDto book);

    Book getById(Long id);

    void delete(Long id);

    void update(Long id, BookDto book);
}
