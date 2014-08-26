package org.smartcity.cityevents.dao;

import org.smartcity.cityevents.entities.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserDAOImpl implements UserDAO {

    @Override
    public User getJohnDoe() {
        User user = new User();

        user.setUserId(99);
        user.setFirstName("John");
        user.setLastName("Doe");
        user.setUserName("johndoe");
        user.setAge(20);

        return user;
    }
}
