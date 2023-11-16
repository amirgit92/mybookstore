package com.mybookstore.learning;

import com.mybookstore.learning.entity.Author;
import com.mybookstore.learning.entity.Book;
import com.mybookstore.learning.repository.IAuthorRepository;
import com.mybookstore.learning.repository.IBookRepository;
import jakarta.transaction.Transactional;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collection;

@SpringBootApplication
public class MybookstoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybookstoreApplication.class, args);
    }

    @Bean
    @Transactional
    CommandLineRunner run(IBookRepository bookRepository, IAuthorRepository authorRepository) {
        return args -> {
            Author author1 = new Author();
            author1.setBirthDate(Date.valueOf("1371-01-12"));
            author1.setName("author1Name");
            authorRepository.save(author1);

            Author author2 = new Author();
            author2.setBirthDate(Date.valueOf("1372-02-12"));
            author2.setName("author2Name");
            authorRepository.save(author2);

            Author author3 = new Author();
            author3.setBirthDate(Date.valueOf("1372-03-12"));
            author3.setName("author3Name");
            authorRepository.save(author3);

            Author author4 = new Author();
            author4.setBirthDate(Date.valueOf("1372-04-12"));
            author4.setName("author4Name");
            authorRepository.save(author4);


            Book book1 = new Book();
            book1.setTitle("book1Title");
            book1.setPublishDate(Date.valueOf("1390-01-12"));
            author1.getBooks().add(book1);
//            book1.setAuthors(collectAuthors(author1,author2));
            bookRepository.save(book1);


            Book book2 = new Book();
            book2.setTitle("book2Title");
            book2.setPublishDate(Date.valueOf("1390-02-12"));
//            book2.setAuthors(collectAuthors(author3,author4));
            bookRepository.save(book2);

            Book book3 = new Book();
            book3.setTitle("book3Title");
            book3.setPublishDate(Date.valueOf("1390-03-12"));
//            book3.setAuthors(collectAuthors(author1,author3));
            bookRepository.save(book3);

            Book book4 = new Book();
            book4.setTitle("book4Title");
            book4.setPublishDate(Date.valueOf("1390-04-12"));
//            book4.setAuthors(collectAuthors(author2,author4));
            bookRepository.save(book4);

            Book book5 = new Book();
            book5.setTitle("book5Title");
            book5.setPublishDate(Date.valueOf("1390-05-12"));
//            book5.setAuthors(collectAuthors(author1,author2,author3));
            bookRepository.save(book5);

            Book book6 = new Book();
            book6.setTitle("book6Title");
            book6.setPublishDate(Date.valueOf("1390-06-12"));
//            book6.setAuthors(collectAuthors(author2,author3,author4));
            bookRepository.save(book6);


//            author1.getBooks().add(book2);
            author2.getBooks().add(book1);
            author2.getBooks().add(book3);
            author3.getBooks().add(book3);
            author3.getBooks().add(book4);
            author4.getBooks().add(book5);
            author4.getBooks().add(book6);
        };
    }

    private Collection<Author> collectAuthors(Author... authors){
        Collection<Author> authorCollection = new ArrayList<>();

        for (Author author : authors){
            authorCollection.add(author);
        }
        return authorCollection;
    }
}