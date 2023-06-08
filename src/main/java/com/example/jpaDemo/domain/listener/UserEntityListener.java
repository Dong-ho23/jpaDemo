package com.example.jpaDemo.domain.listener;

import com.example.jpaDemo.domain.User;
import  com.example.jpaDemo.domain.UserHistory;
import com.example.jpaDemo.repository.UserHistoryRepository;
import com.example.jpaDemo.support.BeanUtils;
import javax.persistence.PostPersist;
import javax.persistence.PostUpdate;


public class UserEntityListener {
    @PostPersist
    @PostUpdate
    public void prePersistAndPreUpdate(Object o) {
        UserHistoryRepository userHistoryRepository = BeanUtils.getBean(UserHistoryRepository.class);

        User user = (User) o;

        UserHistory userHistory = new UserHistory();
        userHistory.setName(user.getName());
        userHistory.setEmail(user.getEmail());
        userHistory.setUser(user);
        userHistory.setHomeAddress(user.getHomeAddress());
        userHistory.setCompanyAddress(user.getCompanyAddress());

        userHistoryRepository.save(userHistory);
    }
}
