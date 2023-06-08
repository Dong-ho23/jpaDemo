package com.example.jpaDemo.repository;

import com.example.jpaDemo.domain.UserHistory;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserHistoryRepository extends JpaRepository<UserHistory, Long> {
    List<UserHistory> findByUserId(Long userId);
}
