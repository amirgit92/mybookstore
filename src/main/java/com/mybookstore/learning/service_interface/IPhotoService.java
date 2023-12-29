package com.mybookstore.learning.service_interface;

import com.mybookstore.learning.entity.Photo;

import java.util.List;
import java.util.Optional;

public interface IPhotoService {
    Optional<Photo> findById(Long id);
    List<Photo> getAll();
    void deleteById(Long id);
    Photo insertOrUpdate(Photo photo);
}
