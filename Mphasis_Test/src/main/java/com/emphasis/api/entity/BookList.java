package com.emphasis.api.entity;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class BookList {

	private List<Book> books = new ArrayList<>();
	
}
