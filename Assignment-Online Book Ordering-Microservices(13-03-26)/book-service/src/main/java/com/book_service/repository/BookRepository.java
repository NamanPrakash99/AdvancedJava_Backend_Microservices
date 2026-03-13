package com.book_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.book_service.entity.Book;

public interface BookRepository extends JpaRepository<Book,Integer> {

}
