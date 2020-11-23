package com.example.demo.Service;

import org.springframework.stereotype.Service;

import com.example.demo.model.Books;

@Service
public interface BookService {
	
	
	public void saveBooks(Books book);

	void saveBooks(Books book, String filename);
}


