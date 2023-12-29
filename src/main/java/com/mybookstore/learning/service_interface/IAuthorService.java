package com.mybookstore.learning.service_interface;

import com.mybookstore.learning.entity.Author;

import java.util.List;
import java.util.Optional;

public interface IAuthorService {

    Optional<Author> findById(Long id);
    List<Author> getAll();
    void deleteById(Long id);
    Author insertOrUpdate(Author author);
}
