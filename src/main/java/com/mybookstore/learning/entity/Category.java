package com.mybookstore.learning.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;

@Data
@Entity
@Table(name = "categories")
@NoArgsConstructor
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private CategoryList categories;

    @ManyToOne
    @JoinColumn(name = "parent_id")
    private Category parent;

    @OneToMany
    private Collection<Category> children;

    @ManyToMany(mappedBy = "categories")
    private Collection<Book> books;
}
