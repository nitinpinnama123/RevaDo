package com.revature.revado.service;

import com.revature.revado.entity.User;
import com.revature.revado.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.UUID;

/**
 * @author $ {USER}
 **/
@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepo;

    public User createUser(String username, String password, String email, String fName, String lName) {
        if (userRepo.findByUsername(username).isPresent())
        {
            throw new RuntimeException("Username already exists");
        }
        if (userRepo.findByEmail(email).isPresent())
        {
            throw new RuntimeException("Email already exists");
        }

        User user = User.builder()
                .username(username)
                .password(password)
                .email(email)
                .fName(fName)
                .lName(lName)
                .build();
        return userRepo.save(user);
    }

    public void deleteUser(UUID userId) {

        if (!userRepo.existsById(userId)) {
            throw new RuntimeException("User not found with id: " + userId);
        }

        userRepo.deleteById(userId);
    }

    public User updateUser(UUID userId,
                           String username,
                           String newPassword,
                           String newFName,
                           String newLName) {

        User existingUser = userRepo.findById(userId)
                .orElseThrow(() -> new RuntimeException("User not found"));

        existingUser.setUsername(username);
        existingUser.setPassword(newPassword);
        existingUser.setFName(newFName);
        existingUser.setLName(newLName);

        return userRepo.save(existingUser);
    }

    public List<User> getUsers() {
        return userRepo.findAll();
    }

    public User getUserById(UUID userID)
    {
        return userRepo.findById(userID)
                .orElseThrow(() ->
                        new RuntimeException("User not found with id: " + userID));
    }
}
