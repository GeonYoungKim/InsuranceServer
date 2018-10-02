package com.geonyeong.insurance.controller;

import com.geonyeong.insurance.dto.UserDto;
import com.geonyeong.insurance.entity.UserEntity;
import com.geonyeong.insurance.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/user/*")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    @PostMapping(value = "/create")
    public String create(@RequestBody UserDto user){
        String pwd = user.getPassword();
        user.setPassword(passwordEncoder.encode(pwd));
        userRepository.save(UserEntity.builder()
                .username(user.getUsername())
                .password(user.getPassword())
                .email(user.getEmail())
                .build());
        return "success add User";
    }

}
