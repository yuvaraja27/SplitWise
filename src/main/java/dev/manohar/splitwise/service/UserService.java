package dev.manohar.splitwise.service;

import dev.manohar.splitwise.exceptions.UserNotFoundException;
import dev.manohar.splitwise.models.User;
import dev.manohar.splitwise.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    public User createUser(User user){
        return userRepository.save(user);
    }
    public User findUserById(Integer id){
        return userRepository.findById(id).orElseThrow(()->new UserNotFoundException("User is not found with: " +id));
    }
}

