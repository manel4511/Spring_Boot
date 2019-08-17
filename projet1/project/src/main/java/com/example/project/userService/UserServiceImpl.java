package com.example.project.userService;

import com.example.project.Dao.UserRepository;
import com.example.project.Entity.UserApp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements userService{

    @Autowired
    private UserRepository userRepository;


    @Override
    public UserApp saveUser(UserApp user) {
        return userRepository.save(user);
    }

    @Override
    public UserApp upsateUser(UserApp user) {

        return userRepository.saveAndFlush(user);
    }

    @Override
    public List<UserApp> getAllUserList() {

        return userRepository.findAll();
    }

    @Override
    public Optional<UserApp> findUserById(long UserId) {

        return userRepository.findById(UserId);
    }
    @Override
    public void deleteUserById(long userId){
        userRepository.deleteById(userId);



    }


}

