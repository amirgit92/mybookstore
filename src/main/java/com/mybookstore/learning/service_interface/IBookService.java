package com.mybookstore.learning.service_interface;

import com.mybookstore.learning.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.swing.text.html.Option;
import java.util.Optional;

public interface IBookService {

    public Optional<Book> findById(Long id);
}
