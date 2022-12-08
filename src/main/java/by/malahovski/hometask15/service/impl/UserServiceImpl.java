package by.malahovski.hometask15.service.impl;

import by.malahovski.hometask15.model.User;
import by.malahovski.hometask15.repository.dataBase.UsersDataBase;
import by.malahovski.hometask15.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;


@Service
public class UserServiceImpl implements UserService {

    private final UsersDataBase usersDataBase;

    @Autowired
    public UserServiceImpl(UsersDataBase usersDataBase) {
        this.usersDataBase = usersDataBase;
    }

    @Override
    public List<User> receivingAllUser() {
        return new ArrayList<>(usersDataBase.findAllUser());
    }

    @Override
    public User receivingUserById(Long id) {
        return usersDataBase.findUserById(id);
    }

    @Override
    public List<User> receivingUserByAge(Integer ageMore) {

        List<User> usersListAgeMore = new ArrayList<>();
        List<User> users = usersDataBase.findAllUser();

        for (User user : users) {
            if (user.getAgeUser() > ageMore) {
                usersListAgeMore.add(user);
            }
        }
        return usersListAgeMore;
    }
}
