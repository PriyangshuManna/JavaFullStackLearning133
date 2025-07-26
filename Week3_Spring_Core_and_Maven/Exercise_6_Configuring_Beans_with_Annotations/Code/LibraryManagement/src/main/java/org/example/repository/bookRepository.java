package org.example.repository;

import org.springframework.stereotype.Repository;

@Repository
public class bookRepository {
    public void addBook(){
        System.out.println("book is added!");
    }
}
