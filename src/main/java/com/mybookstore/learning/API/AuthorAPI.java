package com.mybookstore.learning.API;

import com.mybookstore.learning.entity.Author;
import com.mybookstore.learning.service_interface.IAuthorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/author")
public class AuthorAPI {

    IAuthorService service;

    public AuthorAPI(IAuthorService service) {
        this.service = service;
    }

    @GetMapping("get-author/{id}")
    public Optional<Author> getById(@PathVariable("id") Long id) {
        return service.findById(id);
    }

    @GetMapping("get-all")
    public List<Author> getAll() {
        return service.getAll();
    }

    @DeleteMapping("delete/{id}")
    public void deleteById(@PathVariable("id") Long id) {
        service.deleteById(id);
    }

    @PostMapping("save")
    public Author insertOrUpdate(Author author) {
        return service.insertOrUpdate(author);
    }
}
