package com.example.project.userService;

import com.example.project.DTO.QuestionDto;
import com.example.project.Dao.QuestionRepository;
import com.example.project.Dao.ThemeRepository;
import com.example.project.Entity.Question;

import com.example.project.Entity.Theme;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sun.awt.windows.ThemeReader;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

@Service

public class QuestionServiceImpl implements QuestionService {

    @Autowired
    QuestionRepository questionrepository ;
    @Autowired
    ThemeRepository themeRepository;
    @Override
    public Question saveQuestion(QuestionDto questionDto) {
        Question q = new Question();
        Theme theme = themeRepository.findThemeByName(questionDto.getTheme()).get();
        if (theme==null) throw new RuntimeException("theme n'existe pas");
        q.setLibelle(questionDto.getLibelle());
        q.setTheme(theme);

        return questionrepository.save(q);
    }

    @Override
    public  Question updateQuestion(Question question) {
        return questionrepository.saveAndFlush(question);
    }

    @Override
    public List<Question> getAllQuestionList() {

        return questionrepository.findAll();
    }

    @Override
    public void deleteQuestion(long idQuestion) {
        questionrepository.deleteById(idQuestion);

    }
    @Override
    public Optional<Question> findQuestion(Question question) {
        return questionrepository.findById(question.getIdQuestion());
    }

    @Override
    public Optional<Question> findQuestionById(long idQuestion) {

        return questionrepository.findById(idQuestion);
    }


}
