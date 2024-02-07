package com.gdme.bms.controller;

import com.gdme.bms.book.Book;
import com.gdme.bms.bookrepository.BookRepository;
import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class BookController {

    @Autowired
    private BookRepository bookRepository;

    @GetMapping("/")
    public String listBooks(Model model) {
        model.addAttribute("books", bookRepository.findAll());
        return "books/list"; // Refers to src/main/resources/templates/books/list.html
    }

    @GetMapping("/book/new")
    public String showAddForm(Model model) {
        model.addAttribute("book", new Book());
        return "books/add"; // Refers to src/main/resources/templates/books/add.html
    }

    @PostMapping("/book/save")
    public String saveBook(@ModelAttribute("book") Book book, BindingResult result) {
        if (result.hasErrors()) {
            return "books/add";
        }
        bookRepository.save(book);
        return "books/list";
    }


    // Add methods for update and delete here
}