package com.mybookstore.learning.service;

import com.mybookstore.learning.entity.Author;
import com.mybookstore.learning.repository_interface.IAuthorRepository;
import com.mybookstore.learning.service_interface.IAuthorService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AuthorService implements IAuthorService {

    IAuthorRepository repository;

    public AuthorService(IAuthorRepository repository) {
        this.repository = repository;
    }

    @Override
    public Optional<Author> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public List<Author> getAll() {
        return repository.findAll();
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    @Override
    public Author insertOrUpdate(Author author) {
        return repository.save(author);
    }
}
