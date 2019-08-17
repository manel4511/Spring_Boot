package com.example.project.Dao;

import com.example.project.Entity.UserApp;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

@Repository
public interface UserRepository  extends JpaRepository<UserApp,Long>{


}
