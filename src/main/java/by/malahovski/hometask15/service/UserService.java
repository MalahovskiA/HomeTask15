package by.malahovski.hometask15.service;

import by.malahovski.hometask15.model.User;
import org.springframework.stereotype.Service;
import java.util.List;


public interface UserService {
    List<User> receivingAllUser();

    User receivingUserById(Long Id);

    List<User> receivingUserByAge(Integer ageMore);
}
