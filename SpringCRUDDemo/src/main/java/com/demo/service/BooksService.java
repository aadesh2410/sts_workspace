package com.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.model.Book;
import com.demo.repository.BooksRepository;

@Service
public class BooksService {

	@Autowired
	private BooksRepository booksRepository;

	//get all the books record from db
	public List<Book> getAllBooks() {
		List<Book> books = new ArrayList<Book>();
		booksRepository.findAll().forEach(books1 -> books.add(books1));
		return books;
	}

	//save or update record into the db
	public void saveOrUpdate(Book books) {
		booksRepository.save(books);
	}

	//delete a record from db
	public void delete(Book books) {
		booksRepository.delete(books);
	}
}

