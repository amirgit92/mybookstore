package com.mybookstore.learning.repository_interface;

import com.mybookstore.learning.entity.Photo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPhotoRepository extends JpaRepository<Photo,Long> {
}
