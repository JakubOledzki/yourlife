package com.joledzki.yourlife.service;

import com.joledzki.yourlife.model.User;
import com.joledzki.yourlife.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.validation.Valid;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public ResponseEntity<String> saveUser(@Valid User user) throws Exception {
        if(user.getEmail() == null || user.getPassword() == null){
            throw new Exception("Bad credentials");
        }
        else{
            userRepository.save(user);
            return ResponseEntity.ok("User was add");
        }
    }

}
