package com.emphasis.api.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.emphasis.api.entity.Book;
import com.emphasis.api.service.BookService;
import com.emphasis.api.service.BookServiceImpl;

@RestController
public class BookRestController {

	@Autowired
	private BookService bookService;

	@GetMapping("/")
	public List<Book> allBooks() throws Exception {
		//this will add all the books from api to db
		bookService.addAllBooks();
		List<Book> allBooks = bookService.getAllBooks();
		System.out.println("-------"+allBooks.size());
		return allBooks;
	}

	@GetMapping("/{bookId}")
	public Book oneBook(@PathVariable Long bookId) {
		return bookService.getBook(bookId);
	}

	@PostMapping("/")
	public Book addBook(@RequestBody Book book) {
		return bookService.addBook(book);
	}
}
