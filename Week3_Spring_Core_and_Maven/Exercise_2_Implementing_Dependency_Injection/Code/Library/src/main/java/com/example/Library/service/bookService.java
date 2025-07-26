package com.example.Library.service;

import com.example.Library.repository.bookRepository;

public class bookService {
    private bookRepository bookRepo;

    public void setBookRepo(bookRepository bookRepo){
        this.bookRepo = bookRepo;
        System.out.println("book repo is created");
    }
}
