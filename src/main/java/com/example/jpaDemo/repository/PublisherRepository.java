package com.example.jpaDemo.repository;

import com.example.jpaDemo.domain.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PublisherRepository extends JpaRepository<Publisher, Long> {
}
