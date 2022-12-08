package by.malahovski.hometask15.repository;

import by.malahovski.hometask15.model.User;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface UsersRepository {

    List<User> findAllUser();

    User findUserById(Long id);

    boolean addUser(User user);
}
