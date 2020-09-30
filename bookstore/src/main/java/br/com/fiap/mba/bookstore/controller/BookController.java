package br.com.fiap.mba.bookstore.controller;

import br.com.fiap.mba.bookstore.entity.Book;
import br.com.fiap.mba.bookstore.dto.BookDto;
import br.com.fiap.mba.bookstore.service.BookService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    private BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    private Book addBook(@RequestBody BookDto bookDto){
        return bookService.create(bookDto);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    private List<Book> getBooksList(){
        return bookService.findall();
    }

    @PutMapping()
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public Book update(@RequestParam Long id,
                       @RequestBody BookDto bookDto){
        bookService.update(id, bookDto);
        return new Book(bookDto);
    }

    @GetMapping("getBook")
    @ResponseStatus(HttpStatus.OK)
    private Book getById(@RequestParam Long id){
        return bookService.getById(id);
    }

    @DeleteMapping
    @ResponseStatus(HttpStatus.NO_CONTENT)
    private Book delete(@RequestParam Long id){
        bookService.delete(id);
        return new Book();
    }

}
