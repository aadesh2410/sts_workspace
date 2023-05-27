package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.Book;
import com.demo.service.BooksService;

@RestController
@RequestMapping("/books")
public class BooksController {

	@Autowired
	private BooksService booksService;

	@GetMapping("/getbook")
	private List<Book> getAllBooks() {
		return booksService.getAllBooks();
	}

	@PostMapping("/savebooks")
	private int saveBook(@RequestBody Book books) {
		booksService.saveOrUpdate(books);
		return books.getBookid();
	}
	@DeleteMapping("/deletebook")
	private String deleteBook(@RequestBody Book book) {
		booksService.delete(book);
		return "deletion successful";
	}

}
