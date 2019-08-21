package com.techchefs.librarymngt.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.techchefs.librarymngt.dto.Book;
import com.techchefs.librarymngt.dto.Response;
import com.techchefs.librarymngt.dto.UserBean;
import com.techchefs.librarymngt.service.LibraryServiceImpl;

@RestController
public class AdminController {
	
	@Autowired
	LibraryServiceImpl libraryService;
	
	@PostMapping(path = "/addUser", produces = MediaType.APPLICATION_JSON_VALUE)
	public Response createUser(UserBean user, HttpServletRequest request) {
		return libraryService.createUser(user, request);
	}
	
	@PostMapping(path="/updateUser",produces=MediaType.APPLICATION_JSON_VALUE)
	public Response updateUser(UserBean user, HttpServletRequest request) {
		return libraryService.updateUser(user, request);
	}
	
	@PutMapping(path="/deactivateUser",produces=MediaType.APPLICATION_JSON_VALUE)
	public Response deActivateUser(int id, HttpServletRequest request) {
		return libraryService.deActivateUser(id, request);
	}

}
