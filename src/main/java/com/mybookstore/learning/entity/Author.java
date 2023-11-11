package com.mybookstore.learning.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.util.Collection;

@Data
@Entity
@Table(name = "authors")
@NoArgsConstructor
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private Timestamp birthDate;

    @ManyToMany
    @JoinTable(
            name = "authors-books",
            joinColumns = @JoinColumn(name = "book_id"),
            inverseJoinColumns = @JoinColumn(name = "author_id")
    )
    private Collection<Book> books;

}
