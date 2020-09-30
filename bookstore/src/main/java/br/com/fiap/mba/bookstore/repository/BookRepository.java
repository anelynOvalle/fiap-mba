package br.com.fiap.mba.bookstore.repository;

import br.com.fiap.mba.bookstore.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
