package com.example.project.Controller;

import com.example.project.DTO.QuestionDto;
import com.example.project.Dao.QuestionRepository;
import com.example.project.Dao.ThemeRepository;
import com.example.project.Entity.Question;

import com.example.project.Entity.Theme;
import com.example.project.userService.QuestionService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class QuestionController {



    @Autowired
    private QuestionService questionservice;
    @Autowired
    private QuestionRepository questionRepository;
    @Autowired
    private ThemeRepository themeRepository;


    @RequestMapping(method = RequestMethod.POST, value = "/savequestion")
    public Question addQuestion(@RequestBody QuestionDto question) {

        return questionservice.saveQuestion(question);
    }

    @GetMapping("/allquestion")
    public List<Question> getAllQuestion() {

        return questionservice.getAllQuestionList();
    }
    @RequestMapping("/{idQuestion}")
    public Optional<Question> findById(@PathVariable long idQuestion){

        return questionservice.findQuestionById(idQuestion);
    }



    @RequestMapping(method = RequestMethod.DELETE, value = "/{idQuestion}")
    public void deletequestion(@PathVariable long idQuestion) {

        questionservice.deleteQuestion(idQuestion);
    }

   /* @PostMapping ("/quiz")
    public List<Question> quizGet(@RequestBody QuestionDto questionDto){

       Theme theme = themeRepository.findThemeByName(questionDto.getTheme()).get();
      if (theme==null) throw new RuntimeException("there is no theme");

        return  questionRepository.findAllByTheme(theme).get();
    }*/


}


