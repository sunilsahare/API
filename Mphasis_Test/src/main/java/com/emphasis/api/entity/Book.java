package com.emphasis.api.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import lombok.Data;

@Data
@Entity
@Table(name = "books")
public class Book {

	@Id
	@Cascade(CascadeType.ALL)
	private Long bookID;
	
	@Column(length = Integer.MAX_VALUE)
	private String title;
	
	@Column(length = Integer.MAX_VALUE)
	private String authors;
	
	@Column(length = Integer.MAX_VALUE)
	private String average_rating;
	
	@Column(length = Integer.MAX_VALUE)
	private String isbn;
	
	@Column(length = Integer.MAX_VALUE)
	private String language_code;
	
	@Column(length = Integer.MAX_VALUE)
	private String ratings_count;
	
	@Column(length = Integer.MAX_VALUE)
	private float price;
	
}
