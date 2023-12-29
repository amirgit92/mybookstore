package com.mybookstore.learning.repository_interface;

import com.mybookstore.learning.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBookRepository extends JpaRepository<Book, Long> {
}
