package com.example.jpaDemo.repository;

import com.example.jpaDemo.domain.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {
}
