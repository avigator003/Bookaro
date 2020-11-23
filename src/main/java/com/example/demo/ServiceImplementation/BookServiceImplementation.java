package com.example.demo.ServiceImplementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Books;
import com.example.demo.repository.BookRepository;

@Service
public class BookServiceImplementation {

	@Autowired
	private BookRepository repo;
	
	public Books getBook(int bookId)
	{
		return repo.getOne(bookId);
	}
}
