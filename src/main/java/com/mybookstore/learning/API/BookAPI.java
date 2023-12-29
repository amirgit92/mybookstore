package com.mybookstore.learning.API;

import com.mybookstore.learning.entity.Book;
import com.mybookstore.learning.service_interface.IBookService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/book")
public class BookAPI {

    private final IBookService service;

    public BookAPI(IBookService service) {
        this.service = service;
    }

    @GetMapping("get-book/{id}")
    public Optional<Book> getById(@PathVariable("id") Long id) {
        return service.findById(id);
    }

    @GetMapping("get-all")
    public List<Book> getAll() {
        return service.gatAll();
    }

    @DeleteMapping("delete/{id}")
    public void deleteById(@PathVariable("id") Long id) {
        service.deleteById(id);
    }

    @PostMapping("save")
    public Book insertOrUpdate(Book book) {
        return service.insertOrUpdate(book);
    }
}
