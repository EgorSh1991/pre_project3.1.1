package com.shundeev.src.dao;

import com.shundeev.src.model.User;
import org.springframework.stereotype.Repository;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class UserDAOImpl implements UserDAO{

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<User> getUsers() {
        return entityManager.createQuery("from User", User.class).getResultList();
    }

    @Override
    public void addUser(User user) {
        entityManager.persist(user);
    }

    @Override
    public void delete(long id){
        entityManager.remove(getIdUser(id));
    }
    @Override
    public User getIdUser(long id) {
        return entityManager.find(User.class, id);
    }
    @Override
    public void updateUser(long id, User updateUser) {
        User userToBeUpdated = getIdUser(id);
        userToBeUpdated.setName(updateUser.getName());
        userToBeUpdated.setLastName(updateUser.getLastName());
        userToBeUpdated.setAge(updateUser.getAge());
    }
}
