package com.mybookstore.learning.service;

import com.mybookstore.learning.entity.Book;
import com.mybookstore.learning.repository_interface.IBookRepository;
import com.mybookstore.learning.service_interface.IBookService;
import org.springframework.stereotype.Service;

import java.awt.font.OpenType;
import java.util.List;
import java.util.Optional;

@Service
public class BookService implements IBookService {
    private final IBookRepository repository;

    public BookService(IBookRepository repository) {
        this.repository = repository;
    }
    @Override
    public Optional<Book> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public List<Book> gatAll() {
        return repository.findAll();
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    @Override
    public Book insertOrUpdate(Book book) {
        return repository.save(book);
    }
}
