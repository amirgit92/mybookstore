package com.mybookstore.learning.repository;

import com.mybookstore.learning.entity.Photo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPhotoRepository extends JpaRepository<Photo,Long> {
}
