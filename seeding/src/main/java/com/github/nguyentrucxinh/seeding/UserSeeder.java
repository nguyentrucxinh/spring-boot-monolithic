package com.github.nguyentrucxinh.seeding;

import com.github.nguyentrucxinh.domain.User;
import com.github.nguyentrucxinh.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserSeeder implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... strings) throws Exception {
        User user1 = new User();
        user1.setUsername("user1");
        user1.setPassword("123456");
        user1.setPasswordSalt("user1");
        user1.setFirstName("User");
        user1.setLastName("One");

        User user2 = new User();
        user2.setUsername("user2");
        user2.setPassword("123456");
        user2.setPasswordSalt("user2");
        user2.setFirstName("User");
        user2.setLastName("Two");

        List<User> users = new ArrayList<>();
        users.add(user1);
        users.add(user2);

        userRepository.save(users);
    }
}
