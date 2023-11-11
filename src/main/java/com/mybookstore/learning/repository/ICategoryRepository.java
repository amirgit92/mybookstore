package com.mybookstore.learning.repository;

import com.mybookstore.learning.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICategoryRepository extends JpaRepository<Category,Long> {
}
