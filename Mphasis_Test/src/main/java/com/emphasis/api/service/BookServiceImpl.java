package com.emphasis.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.emphasis.api.entity.Book;
import com.emphasis.api.repos.BookRepository;
import com.emphasis.api.restcontroller.RESTClient;

@Service
public class BookServiceImpl implements BookService {

	@Autowired
	private BookRepository bookRepository;
	
	@Autowired
	private RESTClient restClient;
	
	public BookServiceImpl() {
		this.restClient = new RESTClient();
	}
	
	@Override
	public Book getBook(Long id) {
		return bookRepository.findById(id).get();
	}

	@Override
	public List<Book> getAllBooks() {
		return bookRepository.findAll();
	}

	@Override
	public Book addBook(Book book) {
		return bookRepository.save(book);
	}

	@Override
	@Transactional
	public void addAllBooks() throws Exception {
		List<Book> booksList = restClient.addAllDataOfAPIInDB();
		List<Book> res = bookRepository.saveAll(booksList);
	}

}
