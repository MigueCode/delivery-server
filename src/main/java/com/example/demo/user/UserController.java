package com.example.demo.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

  private UserService userService;

  @Autowired
  public UserController(UserService userService) {
    this.userService = userService;
  }


  @GetMapping
  public List<User> getUsers() {
    return userService.getUsers();
  }

  @PostMapping("/save")
  public void saveUser(@RequestBody User user) {
    userService.saveUser(user);
  }

}
