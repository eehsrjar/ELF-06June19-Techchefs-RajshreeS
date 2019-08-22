package com.techchefs.librarymngt.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.techchefs.librarymngt.dto.UserBean;

public interface UserRepository extends CrudRepository<UserBean, Integer>{
	@Query("select u from UserBean u where u.email=:email")
	public UserBean findByEmail(String email);
	@Query("select u from UserBean u where u.firstName LIKE CONCAT('%', :name,'%')")
	public List<UserBean> findByFirstName(String name);
}
