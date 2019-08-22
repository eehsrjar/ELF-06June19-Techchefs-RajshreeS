package com.techchefs.librarymngt.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;

import com.techchefs.librarymngt.dto.Book;
import com.techchefs.librarymngt.dto.Response;
import com.techchefs.librarymngt.dto.UserBean;
@Service
public interface LibraryService {
	public Response userLogin(String email,String password,HttpServletRequest request);
	public Response userLogout(HttpSession session);
	public Response createUser(UserBean user,HttpServletRequest request);
	public Response updateUser(UserBean user,HttpServletRequest request);
	public Response deActivateUser(int id,HttpServletRequest request);
	public Response searchUserByName(String name,HttpServletRequest request);
	public Response getAllUser(HttpServletRequest request);
	public Response addBookDetails(Book book,HttpServletRequest request);
	public Response getBookDetails(int id,HttpServletRequest request);
}
