package com.example.project.Controller;

import com.example.project.Entity.UserApp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

import com.example.project.userService.userService;


@RequestMapping({"/api"})
@RestController
public class UserController {
    @Autowired
    private userService userservice;

    @RequestMapping(method = RequestMethod.POST, value = "/save")
    public UserApp addUser(@RequestBody UserApp user) {

        return userservice.saveUser(user);
    }

    @GetMapping
    public List<UserApp> getAllUser() {
        return userservice.getAllUserList();
    }

    @PutMapping
    public UserApp update(@RequestBody UserApp user) {
        return userservice.upsateUser(user);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{userId}")
    public void deleteUser(@PathVariable long userId) {
        userservice.deleteUserById(userId);



    }
    @RequestMapping("/{userId}")
    public Optional<UserApp> findById(@PathVariable long userId) {
       return userservice.findUserById(userId);

    }
}



