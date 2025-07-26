package org.example.service;

import org.example.repository.bookRepository;
import org.springframework.stereotype.Service;

@Service
public class bookService {
    private bookRepository bookRepo;

    public void setBookRepo(bookRepository bookRepo){
        this.bookRepo = bookRepo;
        System.out.println("book repo is created");
    }
}
