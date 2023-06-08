package com.example.jpaDemo.service;

import com.example.jpaDemo.domain.Book;
import com.example.jpaDemo.repository.AuthorRepository;
import com.example.jpaDemo.repository.BookRepository;
import java.util.List;
import javax.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@RequiredArgsConstructor
@Transactional
public class BookService {
    private final BookRepository bookRepository;
    private final AuthorRepository authorRepository;
    private final EntityManager entityManager;
    private final AuthorService authorService;

//    @Transactional(propagation = Propagation.REQUIRED)
    public void putBookAndAuthor() {
        Book book = new Book();
        book.setName("JPA 시작하기");

        bookRepository.save(book);

        try {
            authorService.putAuthor();
        } catch (RuntimeException e) {
        }

        throw new RuntimeException("오류가 발생하였습니다. transaction은 어떻게 될까요?");

//        Author author = new Author();
//        author.setName("martin");
//
//        authorRepository.save(author);
//
//        throw new RuntimeException("오류가 나서 DB commit이 발생하지 않습니다");
    }

//    @Transactional(isolation = Isolation.SERIALIZABLE)
    public void get(Long id) {
        System.out.println(">>> " + bookRepository.findById(id));
        System.out.println(">>> " + bookRepository.findAll());

        entityManager.clear();

        System.out.println(">>> " + bookRepository.findById(id));
        System.out.println(">>> " + bookRepository.findAll());

        bookRepository.update();

        entityManager.clear();

//        Book book = bookRepository.findById(id).get();
//        bookRepository.save(book);
    }

    @Transactional
    public List<Book> getAll() {
        List<Book> books = bookRepository.findAll();

        books.forEach(System.out::println);

        return books;
    }

}
