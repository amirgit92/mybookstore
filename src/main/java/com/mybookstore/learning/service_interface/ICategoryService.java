package com.mybookstore.learning.service_interface;

import com.mybookstore.learning.entity.Category;

import java.util.List;
import java.util.Optional;

public interface ICategoryService {
    Optional<Category> findById(Long id);
    List<Category> getAll();
    void deleteById(Long id);
    Category insertOrUpdate(Category category);
}
