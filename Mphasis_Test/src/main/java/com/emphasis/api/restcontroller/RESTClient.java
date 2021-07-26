package com.emphasis.api.restcontroller;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.emphasis.api.entity.Book;
import com.emphasis.api.service.BookService;
import com.emphasis.api.service.BookServiceImpl;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import net.bytebuddy.asm.Advice.This;

@Component
public class RESTClient {

	public List<Book> addAllDataOfAPIInDB() throws IOException, URISyntaxException {
		ObjectMapper mapper = new ObjectMapper();
		List<Book> bks = null;
		try {

			URL url = new URL("https://s3-ap-southeast-1.amazonaws.com/he-public-data/books8f8fe52.json");

			Book[] books = mapper.readValue(url, Book[].class);
			bks = Arrays.asList(books);

			System.out.println("-----------------------");
			for (Book book : books) {
				System.out.println("Book: " + book);
			}
			System.out.println("-----------------------");

			mapper.enable(SerializationFeature.INDENT_OUTPUT);

			return bks;

		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return bks;
	}

}
