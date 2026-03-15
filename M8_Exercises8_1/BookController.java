	package com.example.M8_Exercises8_1;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    // Simple static list of books
    private final List<Book> books = List.of(
        new Book(1, "The mountain is you"),
        new Book(2, "Atomic Habit"),
        new Book(3, "Rich dad poor dad")
    );

    // Inner class for Book
    static class Book {
        private int id;
        private String title;

        public Book(int id, String title) {
            this.id = id;
            this.title = title;
        }

        public int getId() { return id; }
        public String getTitle() { return title; }
    }

    // GET /api/books → returns all books
    @GetMapping
    public List<Book> getBooks() {
        return books;
    }

    // GET /api/books/{id} → returns one book or 404
    @GetMapping("/{id}")
    public ResponseEntity<Book> getBookById(@PathVariable int id) {
        return books.stream()
                    .filter(book -> book.getId() == id)
                    .findFirst()
                    .map(ResponseEntity::ok)
                    .orElse(ResponseEntity.notFound().build());
    }
}
