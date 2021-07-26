package com.emphasis.api.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.emphasis.api.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long> {

}
