package org.smartcity.cityevents.presentation;

import org.smartcity.cityevents.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * UserController class
 *
 * @author bogdan.solga
 *
 * Date: 26.08.2014, time: 22:46
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(method = RequestMethod.GET, value = "/{userId}")
    public @ResponseBody String get(@PathVariable Integer userId) {
        return userService.getJohnDoe();
    }
}
