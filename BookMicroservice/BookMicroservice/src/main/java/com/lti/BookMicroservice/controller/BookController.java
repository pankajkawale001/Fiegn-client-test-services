package com.lti.BookMicroservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.lti.BookMicroservice.model.BookModel;

@RestController
@RequestMapping("/books")
public class BookController {

	@GetMapping("/{uuid}")
	public BookModel getBookById(@PathVariable Integer uuid) {
		return new BookModel(uuid, 1, "Spring Boot book", 1075.90);
	}
}
