package com.techchefs.librarymngt.controller;

import java.util.Arrays;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.techchefs.librarymngt.dto.Response;
import com.techchefs.librarymngt.service.LibraryService;
import com.techchefs.librarymngt.service.LibraryServiceImpl;
@CrossOrigin(origins="http://localhost:3000")
@RestController
public class LoginController {
	@Autowired
	LibraryService libraryService;
	
	@PostMapping(path="/login/authenticate",produces=MediaType.APPLICATION_JSON_VALUE)
	public Response userLogin(@RequestParam String email,@RequestParam String password,HttpServletRequest request) {
		return libraryService.userLogin(email, password,request);
	}
	@GetMapping(path="/logout",produces=MediaType.APPLICATION_JSON_VALUE)
	public Response userLogout(HttpSession session) {
		return libraryService.userLogout(session);
	}
	
	
}
