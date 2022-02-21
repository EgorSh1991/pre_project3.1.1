package com.shundeev.src.dao;

import com.shundeev.src.model.User;

import java.util.List;

public interface UserDAO {
    List<User> getUsers();

    void addUser(User user);

    void delete(long id);

    User getIdUser(long id);

    void updateUser(User updateUser);

}
