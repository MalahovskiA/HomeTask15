package by.malahovski.hometask15.controller;


import by.malahovski.hometask15.model.User;
import by.malahovski.hometask15.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@ResponseBody
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<User> getUsers() {
        return userService.receivingAllUser();
    }

    @GetMapping(value = "/{id}")
    public User getUserById(@PathVariable Long id) {
        return userService.receivingUserById(id);
    }

    @GetMapping(value = "/age/{ageMore}")
    public List<User> getCarByCost(@PathVariable Integer ageMore) {
        return userService.receivingUserByAge(ageMore);
    }
}
