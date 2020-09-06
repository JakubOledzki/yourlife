package com.joledzki.yourlife.controller;

import com.joledzki.yourlife.model.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @PostMapping("/user")
    public boolean addUser(@RequestParam User user){



    }

}
