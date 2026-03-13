package com.book_service.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.book_service.entity.Book;
import com.book_service.service.BookService;

@RestController
@RequestMapping("/books")
public class BookController {
	
	public final BookService bookservice;

	public BookController(BookService bookservice) {
		this.bookservice = bookservice;
	}
	
	// create
	
	@PostMapping("/create")
	public Book addBook(@RequestBody Book book) {
		return bookservice.addBook(book);
	}
	
	// readAll
	@GetMapping
	public List<Book> getBooks(){
		return bookservice.getAllBook();
	}
	
	// read by Id
	@PostMapping("/{id}")
	public Book getBook(@PathVariable int id) {
		return bookservice.getBookById(id);
	}
	
	// update
	@PutMapping("/{id}")
	public Book updatedBook(@PathVariable int id,@RequestBody Book book) {
		return bookservice.updateBook(id, book);
	}
	
	//delete
	@DeleteMapping("/{id}")
	public void deleteBook(int id) {
		bookservice.deleteBook(id);
	}
	
	
}
