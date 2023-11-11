package com.mybookstore.learning;

import com.mybookstore.learning.entity.Author;
import com.mybookstore.learning.entity.Book;
import com.mybookstore.learning.repository.IAuthorRepository;
import com.mybookstore.learning.repository.IBookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.sql.Timestamp;
import java.time.LocalDate;

@SpringBootApplication
public class MybookstoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybookstoreApplication.class, args);
    }

    @Bean
    CommandLineRunner run(IBookRepository bookRepository, IAuthorRepository authorRepository){
        return args -> {
            Author author1 = new Author();
            author1.setBirthDate(Timestamp.valueOf("1372-01-12"));
            author1.setName("author1Name");
            authorRepository.save(author1);

            Author author2 = new Author();
            author1.setBirthDate(Timestamp.valueOf("1372-02-12"));
            author1.setName("author2Name");
            authorRepository.save(author2);

            Author author3 = new Author();
            author1.setBirthDate(Timestamp.valueOf("1372-03-12"));
            author1.setName("author3Name");
            authorRepository.save(author3);

            Author author4 = new Author();
            author1.setBirthDate(Timestamp.valueOf("1372-04-12"));
            author1.setName("author4Name");
            authorRepository.save(author4);


            Book book1 = new Book();
            book1.setTitle("book1Title");
            book1.setPublishDate(Timestamp.valueOf("1390-01-12"));
            bookRepository.save(book1);

            List<Book> bookList = null;
            bookList.add(book1);

            List<Author> authorList = null;
            authorList.add();

            author1.setBooks(bookList);
            book1.setAuthors(authorList);
        };
}
