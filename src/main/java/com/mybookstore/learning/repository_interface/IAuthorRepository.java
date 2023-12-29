package com.mybookstore.learning.repository_interface;

import com.mybookstore.learning.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAuthorRepository extends JpaRepository<Author,Long> {
}
