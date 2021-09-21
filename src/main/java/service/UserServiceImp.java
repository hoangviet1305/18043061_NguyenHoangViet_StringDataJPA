package service;

import entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import repository.UserRepository;

import java.util.ArrayList;
import java.util.List;

public class UserServiceImp implements UserService{
    @Autowired
    UserRepository userRepository;

    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> getAllUsers() {
        List<User> list = new ArrayList<>();
        userRepository.findAll().forEach(user -> list.add(user));
        return list;
    }
}
