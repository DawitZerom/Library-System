package com.project.BooksQueryService.repository;

import com.project.BooksQueryService.domain.Book;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface BookRepository extends MongoRepository<Book, Integer> {
}
