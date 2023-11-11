package com.mybookstore.learning.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.util.Collection;

@Data
@Entity
@Table(name = "books")
@NoArgsConstructor
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private Integer totalPages;
    private Timestamp publishDate;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "books_categories",
            joinColumns = @JoinColumn(name = "book_id"),
            inverseJoinColumns = @JoinColumn(name = "category_id")
    )
    private Collection<Category> categories;

    @OneToOne
    @JoinColumn(name = "photo_id")
    private Photo photo;


    @ManyToMany(mappedBy = "books")
    private Collection<Author> authors;

}
