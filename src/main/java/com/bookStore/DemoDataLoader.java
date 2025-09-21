package com.bookStore;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import com.bookStore.entity.Book;
import com.bookStore.service.BookService;

@Component
public class DemoDataLoader implements CommandLineRunner {
    @Autowired
    private BookService bookService;

    @Override
    public void run(String... args) throws Exception {
        if (bookService.getAllBook().isEmpty()) {
            bookService.save(new Book(0, "Atomic Habits", "James Clear", "499"));
            bookService.save(new Book(0, "The Lean Startup", "Eric Ries", "599"));
            bookService.save(new Book(0, "Deep Work", "Cal Newport", "399"));
            bookService.save(new Book(0, "Clean Code", "Robert C. Martin", "799"));
            bookService.save(new Book(0, "The Alchemist", "Paulo Coelho", "299"));
        }
    }
}
