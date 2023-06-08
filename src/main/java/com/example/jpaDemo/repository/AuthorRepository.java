package com.example.jpaDemo.repository;

import com.example.jpaDemo.domain.Author;
import org.springframework.data.jpa.repository.JpaRepository;


public interface AuthorRepository extends JpaRepository <Author, Long> {
}
