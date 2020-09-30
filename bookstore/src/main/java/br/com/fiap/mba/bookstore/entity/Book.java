package br.com.fiap.mba.bookstore.entity;

import br.com.fiap.mba.bookstore.dto.BookDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Double price;

    public Book(Book book){
        this.id = book.getId();
        this.name = book.getName();
        this.price = book.getPrice();
    }

    public Book(BookDto bookDto){
        this.name = bookDto.getName();
        this.price = bookDto.getPrice();
    }
}
