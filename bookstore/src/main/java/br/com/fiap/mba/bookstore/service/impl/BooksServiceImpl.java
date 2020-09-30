package br.com.fiap.mba.bookstore.service.impl;

import br.com.fiap.mba.bookstore.entity.Book;
import br.com.fiap.mba.bookstore.dto.BookDto;
import br.com.fiap.mba.bookstore.exceptions.BookNotFound;
import br.com.fiap.mba.bookstore.repository.BookRepository;
import br.com.fiap.mba.bookstore.service.BookService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BooksServiceImpl implements BookService {

    private BookRepository bookRepository;

    public BooksServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public List<Book> findall() {
        return bookRepository.findAll();
    }

    @Override
    public Book create(BookDto bookDto) {
        Book book = new Book();
        book.setName(bookDto.getName());
        book.setPrice(bookDto.getPrice());
        bookRepository.save(book);
        return book;
    }

    @Override
    public Book getById(Long id) {
        Book book = new Book();
        try{
            book = (Book) bookRepository.findById(id).get();
        }catch (Exception e){
            throw new BookNotFound("Book not found");
        }
        return book;
    }

    @Override
    public void delete(Long id) {
        Book book = getById(id);
        bookRepository.delete(book);
    }

    @Override
    public void update(Long id, BookDto bookDto) {
        Book book = getById(id);
        book.setName(bookDto.getName());
        book.setPrice(bookDto.getPrice());
        bookRepository.save(book);
    }

}