package com.mybookstore.learning.repository;

import com.mybookstore.learning.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAuthorRepository extends JpaRepository<Author,Long> {
}
