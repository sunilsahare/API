package com.emphasis.api.service;

import java.util.List;

import com.emphasis.api.entity.Book;

public interface BookService {

	public Book getBook(Long id);
	public List<Book> getAllBooks();
	public Book addBook(Book book);
	public void addAllBooks() throws Exception;
//	public Book upadteBook(Book book);
//	public void removeBook(Long id);
	
}
