package com.example.devops.spring_devops;


import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class BookController {

    @GetMapping("/books")
    public List<Book> getAllBooks() {
        return Arrays.asList(
            new Book(1, "1984", "George Orwell"),
            new Book(2, "To Kill a Mockingbird", "Harper Lee")
        );
    }
}

