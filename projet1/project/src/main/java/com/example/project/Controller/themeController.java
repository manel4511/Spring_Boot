package com.example.project.Controller;

import com.example.project.DTO.QuestionDto;
import com.example.project.Entity.Question;
import com.example.project.userService.themeService;
import com.example.project.Entity.Theme;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController

@CrossOrigin(origins = "http://localhost:4200",allowedHeaders = "*")
public class themeController {

    @Autowired
    private themeService themeservice;


    @PostMapping( value = "/addtheme")
    public void addTheme(@RequestBody Theme theme){
        themeservice.saveTheme(theme);}

    @GetMapping("/alltheme")
    public List<Theme> getAllTheme() {

        return themeservice.getAllThemeList();
    }

   @PutMapping(path ="/{idTheme}")

    public void update(@RequestBody Theme theme,@PathVariable ("idTheme") long idTheme ){
        theme.setIdTheme(idTheme);
         themeservice.updateTheme(theme);

    }



   @DeleteMapping("/delete/{idTheme}")

    public void delete(@PathVariable (name="idTheme") long idTheme){


        themeservice.deleteTheme(idTheme);

    }


    @GetMapping(path="/{idTheme}")
    public Optional<Theme> findById(@PathVariable ("idTheme") long idTheme){

        return themeservice.findThemeById(idTheme);
    }




}
