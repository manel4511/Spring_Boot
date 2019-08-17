package com.example.project.userService;

import com.example.project.Dao.ThemeRepository;
import com.example.project.Entity.Theme;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class themeServiceIml  implements themeService {
@Autowired
ThemeRepository themeRepository;

    @Override
    public Theme saveTheme(Theme theme)
    {

        return themeRepository.save(theme);
    }

    @Override
    public Theme updateTheme(Theme theme) {

        return themeRepository.saveAndFlush(theme);
    }

    @Override
    public Theme getTheme(long idTheme) {
       return null;
    }



    @Override
    public List<Theme> getAllThemeList() {

        return themeRepository.findAll();
    }

    @Override
    public Optional<Theme> deleteTheme(long idTheme) {

        //themeRepository.deleteById(idTheme);
        Optional<Theme> t = findThemeById(idTheme);
        if(t != null){
            themeRepository.deleteById(idTheme);
        }
        return t;
    }

   @Override
  public Optional<Theme> findTheme(Theme theme) {

        return themeRepository.findById(theme.getIdTheme());
    }

    @Override
    public Optional<Theme> findThemeById(long idTheme) {

        return themeRepository.findById(idTheme);
    }
}

