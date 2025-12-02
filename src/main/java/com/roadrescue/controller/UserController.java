package com.roadrescue.controller;

import com.roadrescue.entity.User;
import com.roadrescue.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @PostMapping("/register")
    public User register(@RequestBody User u){
        // NOTE: add validation & password hashing in production
        u.setRole("USER");
        return userRepository.save(u);
    }

    @PostMapping("/login")
    public String login(@RequestBody User u){
        Optional<User> opt = userRepository.findByEmail(u.getEmail());
        if(opt.isPresent()){
            User db = opt.get();
            if(db.getPassword().equals(u.getPassword())){
                return "OK";
            }
        }
        return "FAIL";
    }
}
