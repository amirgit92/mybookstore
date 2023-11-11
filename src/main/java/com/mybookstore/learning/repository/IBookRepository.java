package com.mybookstore.learning.repository;

import com.mybookstore.learning.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBookRepository extends JpaRepository<Book, Long> {
}
