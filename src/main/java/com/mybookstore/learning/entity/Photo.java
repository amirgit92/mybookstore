package com.mybookstore.learning.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "photoes")
@NoArgsConstructor
public class Photo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String urlSmall;
    private String urlMedium;
    private String urlLarge;

    @OneToOne(mappedBy = "photo")
    private Book book;
}
