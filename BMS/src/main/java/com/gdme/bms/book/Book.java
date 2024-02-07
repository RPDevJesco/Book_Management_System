package com.gdme.bms.book;
import jakarta.persistence.*;
import java.time.LocalDate;

@Entity // Marks this class as a JPA entity
@Table(name = "books") // Specifies the table name in the database
public class Book {

    @Id // Marks the id field as the primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Configures the way ID is generated
    private Long id;

    @Column(nullable = false, unique = true)
    private String isbn;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String author;

    @Column(name = "publication_date")
    private LocalDate publicationDate;

    // Standard constructors, getters, and setters
    public Book() {}

    public void setId(Long id) {
        this.id = id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public LocalDate getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(LocalDate publicationDate) {
        this.publicationDate = publicationDate;
    }
}
