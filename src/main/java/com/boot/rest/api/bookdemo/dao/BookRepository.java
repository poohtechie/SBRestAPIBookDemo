package com.boot.rest.api.bookdemo.dao;

import org.springframework.data.repository.CrudRepository;

import com.boot.rest.api.bookdemo.bean.Book;

public interface BookRepository extends CrudRepository<Book, Integer> {
	
}
