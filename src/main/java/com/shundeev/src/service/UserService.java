package com.shundeev.src.service;

import com.shundeev.src.model.User;

import java.util.List;

public interface UserService {
    List<User> getUsers();

    void addUser(User user);

    void delete(long id);

    User getIdUser(long id);

    void updateUser(long id, User updateUser);
}
