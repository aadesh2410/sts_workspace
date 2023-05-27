package com.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.demo.model.Book;

public interface BooksRepository extends CrudRepository<Book, Integer> {
        
}
