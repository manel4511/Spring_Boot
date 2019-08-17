package com.example.project.Dao;

import com.example.project.Entity.Theme;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;


import java.util.Optional;


@Repository
@CrossOrigin(origins = "http://localhost:4200")

public interface ThemeRepository extends JpaRepository<Theme,Long>{
Optional<Theme> findThemeByName(String name);


}
