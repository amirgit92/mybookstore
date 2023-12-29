package com.mybookstore.learning.service;

import com.mybookstore.learning.entity.Category;
import com.mybookstore.learning.repository_interface.ICategoryRepository;
import com.mybookstore.learning.service_interface.ICategoryService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService implements ICategoryService {

    ICategoryRepository repository;

    public CategoryService(ICategoryRepository repository) {
        this.repository = repository;
    }

    @Override
    public Optional<Category> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public List<Category> getAll() {
        return repository.findAll();
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    @Override
    public Category insertOrUpdate(Category category) {
        return repository.save(category);
    }
}
