package com.example.demo.user;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfig {

  @Bean
  CommandLineRunner commandLineRunner(UserRepository repository) {
    return args -> {
      User Alberto = new User("Alberto", "alberto@gmail.com");
      User Carlos = new User("Carlos", "carlos@gmail.com");
      repository.saveAll(List.of(Alberto, Carlos));
    };

  }
  
}
