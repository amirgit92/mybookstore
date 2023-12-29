package com.mybookstore.learning.API;

import com.mybookstore.learning.entity.Book;
import com.mybookstore.learning.service_interface.IBookService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/book")
public class BookAPI {

    private final IBookService service;

    public BookAPI(IBookService service) {
        this.service = service;
    }

    @GetMapping("get-book/{id}")
    public Optional<Book> getById(@PathVariable("id") Long id){
        return service.findById(id);
    }
}
