package com.example.project.userService;

import com.example.project.Entity.Theme;

import java.util.List;
import java.util.Optional;

public interface themeService {
    Theme saveTheme(Theme theme);
   Theme updateTheme(Theme theme);
   Theme getTheme(long idTheme);
    List<Theme> getAllThemeList();
  Optional<Theme> deleteTheme(long idTheme);
    Optional<Theme> findTheme(Theme theme);

    Optional<Theme> findThemeById(long idTheme);

}
