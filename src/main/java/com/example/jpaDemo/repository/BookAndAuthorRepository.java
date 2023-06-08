package com.example.jpaDemo.repository;

import com.example.jpaDemo.domain.BookAndAuthor;
import org.springframework.data.jpa.repository.JpaRepository;


public interface BookAndAuthorRepository extends JpaRepository<BookAndAuthor, Long> {
}
