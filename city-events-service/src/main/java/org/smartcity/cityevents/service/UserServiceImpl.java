package org.smartcity.cityevents.service;

import org.smartcity.cityevents.dao.UserDAO;
import org.smartcity.cityevents.service.transport.JSONSerializer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * UserServiceImpl class
 *
 * @author bogdan.solga
 *
 * Date: 27.06.2014, time: 09:36
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDAO usersDAO;

    @Autowired
    private JSONSerializer jsonSerializer;

    @Override
    public String getJohnDoe() {
        return jsonSerializer.serialize(usersDAO.getJohnDoe());
    }
}
