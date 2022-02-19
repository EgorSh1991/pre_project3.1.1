package com.shundeev.src.service;

import com.shundeev.src.dao.UserDAO;
import com.shundeev.src.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserDAO userDAO;

    @Autowired
    public UserServiceImpl(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    public List<User> getUsers() {
        return userDAO.getUsers();
    }

    @Override
    @Transactional
    public void addUser(User user) {
        userDAO.addUser(user);
    }

    @Override
    @Transactional
    public void delete(long id) {
        userDAO.delete(id);
    }

    @Override
    public User getIdUser(long id) {
        return userDAO.getIdUser(id);
    }

    @Override
    @Transactional
    public void updateUser(long id, User updateUser) {
        userDAO.updateUser(id, updateUser);
    }
}

