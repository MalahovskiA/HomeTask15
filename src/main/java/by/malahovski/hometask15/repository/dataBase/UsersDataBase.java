package by.malahovski.hometask15.repository.dataBase;

import by.malahovski.hometask15.model.User;
import by.malahovski.hometask15.repository.UsersRepository;
import org.springframework.stereotype.Component;


import java.util.*;

@Component
public class UsersDataBase implements UsersRepository {

    private static Long lastIdUser;

    Map<Long, User> users = new HashMap<>();

    {
        users.put(1L, new User(1L, "Andrei", 40));
        users.put(2L, new User(2L, "Dmitry", 36));
        users.put(3L, new User(3L, "Sergei", 30));
        users.put(4L, new User(4L, "Pavel", 25));
        users.put(5L, new User(5L, "Pavel", 24));
        users.put(6l, new User(6L, "Yra", 24));
    }


    @Override
    public List<User> findAllUser() {
        return new ArrayList<>(users.values());
    }

    @Override
    public User findUserById(Long id) {
        return users.get(id);
    }

    @Override
    public boolean addUser(User user) {
        Long id = ++lastIdUser;
        user.setIdUser(id);
        users.put(id, user);
        return users.containsValue(user);
    }
}
