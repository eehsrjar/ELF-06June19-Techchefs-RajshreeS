package com.techchefs.librarymngt.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.techchefs.librarymngt.dto.Book;
import com.techchefs.librarymngt.dto.Response;
import com.techchefs.librarymngt.service.LibraryServiceImpl;
@CrossOrigin(origins="http://localhost:3000")
@RestController
public class LibrarianController {
	@Autowired
	LibraryServiceImpl libraryService;
	
	@PostMapping(path="/addBook",produces=MediaType.APPLICATION_JSON_VALUE)
	public Response addBookDetails(@RequestBody Book book, HttpServletRequest request) {
		return libraryService.addBookDetails(book, request);
	}
	
	
	@GetMapping(path="/getBook",produces=MediaType.APPLICATION_JSON_VALUE)
	public Response getBookDetails(@RequestParam int id, HttpServletRequest request) {
		return libraryService.getBookDetails(id, request);
	}

}
