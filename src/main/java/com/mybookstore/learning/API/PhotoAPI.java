package com.mybookstore.learning.API;

import com.mybookstore.learning.entity.Photo;
import com.mybookstore.learning.service_interface.IPhotoService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.Optional;

public class PhotoAPI {

    IPhotoService service;

    public PhotoAPI(IPhotoService service) {
        this.service = service;
    }

    @GetMapping("get-photo/{id}")
    public Optional<Photo> getById(@PathVariable("id") Long id) {
        return service.findById(id);
    }

    @GetMapping("get-all")
    public List<Photo> getAll() {
        return service.getAll();
    }

    @DeleteMapping("delete/{id}")
    public void deleteById(@PathVariable("id") Long id) {
        service.deleteById(id);
    }

    @PostMapping("save")
    public Photo insertOrUpdate(Photo photo) {
        return service.insertOrUpdate(photo);
    }
}
