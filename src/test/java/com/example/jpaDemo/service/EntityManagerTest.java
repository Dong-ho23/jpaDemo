package com.example.jpaDemo.service;

import com.example.jpaDemo.domain.User;
import com.example.jpaDemo.repository.UserRepository;
import javax.persistence.EntityManager;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
@Transactional
public class EntityManagerTest {
    @Autowired
    private EntityManager entityManager;
    @Autowired
    private UserRepository userRepository;

    @Test
    void entityManagerTest() {
        System.out.println(entityManager.createQuery("select u from User u").getResultList());
    }

    @Test
    void cacheFindTest() {
//        System.out.println(userRepository.findByEmail("martin@fastcampus.com"));
//        System.out.println(userRepository.findByEmail("martin@fastcampus.com"));
//        System.out.println(userRepository.findByEmail("martin@fastcampus.com"));
//        System.out.println(userRepository.findById(2L).get());
//        System.out.println(userRepository.findById(2L).get());
//        System.out.println(userRepository.findById(2L).get());
//
        userRepository.deleteById(1L);
    }

    @Test
    void cacheFindTest2() {
        User user = userRepository.findById(1L).get();
        user.setName("enddddddgh");
        userRepository.save(user);

        System.out.println("---------------------");

        user.setEmail("enddddddgh@gmail.com");
        userRepository.save(user);

        System.out.println(userRepository.findAll());       // select * from user
    }
}