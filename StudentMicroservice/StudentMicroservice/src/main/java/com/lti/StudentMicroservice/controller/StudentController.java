package com.lti.StudentMicroservice.controller;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.StudentMicroservice.consumer.BookRestConsumer;

@RestController
@RequestMapping("/students")
public class StudentController {
	
	@Autowired
	BookRestConsumer bookConsumer;

	@GetMapping("/studentsBook/{bookuuid}")
	public String getStudentsBook(@PathVariable int bookuuid) throws JSONException {
		String bookDataString = bookConsumer.getBookByID(bookuuid);
		JSONObject jsonObject = new JSONObject(bookDataString);
		System.out.println("Entire Book string, " + bookDataString);
		System.out.println("book id, " + jsonObject.get("bookID"));
		return jsonObject.get("name").toString();
	}
}
