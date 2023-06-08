package com.example.jpaDemo.domain;

import java.time.LocalDateTime;
import org.junit.jupiter.api.Test;

class UserTest {
    @Test
    void test() {
        User user = new User();
        user.setEmail("endgh43@gmail.com");
        user.setName("endgh43");
        user.setCreatedAt(LocalDateTime.now());
        user.setUpdatedAt(LocalDateTime.now());

//        User user1 = new User(null, "endgh43", "endgh43@gmail.com", LocalDateTime.now(), LocalDateTime.now());
        User user2 = new User("endgh43", "endgh43@gmail.com");

        User user3 = User.builder()
                .name("endgh43")
                .email("endgh43@gmail.com")
                .build();

        System.out.println(">>> " + user.toString());
    }

}