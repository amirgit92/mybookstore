package com.mybookstore.learning.service;

import com.mybookstore.learning.entity.Photo;
import com.mybookstore.learning.repository_interface.IPhotoRepository;
import com.mybookstore.learning.service_interface.IPhotoService;

import java.util.List;
import java.util.Optional;

public class PhotoService implements IPhotoService {
    IPhotoRepository repository;
    @Override
    public Optional<Photo> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public List<Photo> getAll() {
        return repository.findAll();
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    @Override
    public Photo insertOrUpdate(Photo photo) {
        return repository.save(photo);
    }
}
