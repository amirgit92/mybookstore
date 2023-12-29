package com.mybookstore.learning.service_interface;

import com.mybookstore.learning.entity.Book;

import java.util.List;
import java.util.Optional;

public interface IBookService {
    Optional<Book> findById(Long id);
    List<Book> gatAll();
    void deleteById(Long id);
    Book insertOrUpdate(Book book);
}
