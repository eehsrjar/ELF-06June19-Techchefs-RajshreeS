package com.techchefs.librarymngt.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.techchefs.librarymngt.dto.Book;
@Repository
public interface BookRepository extends CrudRepository<Book, Integer>{

}
