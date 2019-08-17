package com.example.project.userService;

import com.example.project.Entity.Theme;
import com.example.project.Entity.UserApp;

import java.util.List;
import java.util.Optional;

public interface userService {
UserApp saveUser (UserApp user);
UserApp upsateUser(UserApp user);
List<UserApp> getAllUserList();
Optional<UserApp> findUserById(long UserId);
void deleteUserById(long userId);


}
