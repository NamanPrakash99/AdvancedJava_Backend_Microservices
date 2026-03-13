package com.book_service.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.book_service.entity.Book;
import com.book_service.repository.BookRepository;

@Service
public class BookService {

	public final BookRepository bookrepo;

	public BookService(BookRepository bookrepo) {
		this.bookrepo = bookrepo;
	}
	
	
	// create
	public Book addBook(Book book) {
		return bookrepo.save(book);
	}
	
	
	// Read
	public List<Book> getAllBook() {
		return bookrepo.findAll();
	}
	
	
	// Read by Id
	public Book getBookById(int id) {
		return bookrepo.findById(id).orElseThrow(()->new RuntimeException("Book not found"));
	}
	
	
	// update
	public Book updateBook(int id,Book updatedBook) {
		Book book=bookrepo.findById(id).orElseThrow();
		
		
		book.setTitle(updatedBook.getTitle());
		book.setAuthor(updatedBook.getAuthor());
		book.setPrice(updatedBook.getPrice());
		book.setStock(updatedBook.getStock());
		
		return bookrepo.save(book);
		
	}
	
	// Delete
	public void deleteBook(int id) {
		bookrepo.deleteById(id);
	}
	
	
	// reduce stock
	public void reduceStock(int bookId, int quantity) {
		Book book=bookrepo.findById(bookId).orElseThrow();
		
		book.setStock(book.getStock()-quantity);
		bookrepo.save(book);
	}
	
	
	
}
