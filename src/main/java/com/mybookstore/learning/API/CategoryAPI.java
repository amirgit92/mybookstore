package com.mybookstore.learning.API;

import com.mybookstore.learning.entity.Category;
import com.mybookstore.learning.service_interface.ICategoryService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.Optional;

public class CategoryAPI {
    ICategoryService service;

    public CategoryAPI(ICategoryService service) {
        this.service = service;
    }

    @GetMapping("get-category/{id}")
    public Optional<Category> getById(@PathVariable("id") Long id) {
        return service.findById(id);
    }

    @GetMapping("get-all")
    public List<Category> getAll() {
        return service.getAll();
    }

    @DeleteMapping("delete/{id}")
    public void deleteById(@PathVariable("id") Long id) {
        service.deleteById(id);
    }

    @PostMapping("save")
    public Category insertOrUpdate(Category category) {
        return service.insertOrUpdate(category);
    }
}
