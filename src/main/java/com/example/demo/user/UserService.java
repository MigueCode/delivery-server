package com.example.demo.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class UserService {

  private UserRepository userRepository;

  @Autowired
  public UserService(UserRepository userRepository) {
    this.userRepository = userRepository;
  }


  public List<User> getUsers() {
    return userRepository.findAll();
  }

  public void saveUser(User user) {
    userRepository.save(user);
  }
}
