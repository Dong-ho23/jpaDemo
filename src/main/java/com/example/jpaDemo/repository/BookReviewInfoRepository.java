package com.example.jpaDemo.repository;

import com.example.jpaDemo.domain.BookReviewInfo;
import org.springframework.data.jpa.repository.JpaRepository;


public interface BookReviewInfoRepository extends JpaRepository<BookReviewInfo, Long> {
}
