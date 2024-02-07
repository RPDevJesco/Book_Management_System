package com.gdme.bms.bookrepository;
import com.gdme.bms.book.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
    // JpaRepository provides basic CRUD operations without the need for implementation
}