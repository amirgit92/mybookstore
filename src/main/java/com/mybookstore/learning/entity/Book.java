package com.mybookstore.learning.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Data
@Entity
@Table(name = "books")
//@NoArgsConstructor
public class Book {

    public Book() {
        this.authors = new ArrayList<>();
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private Integer totalPages;
    private Date publishDate;

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


    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "authors_books",
            joinColumns = @JoinColumn(name = "book_id"),
            inverseJoinColumns = @JoinColumn(name = "author_id"))
    private List<Author> authors;

}
