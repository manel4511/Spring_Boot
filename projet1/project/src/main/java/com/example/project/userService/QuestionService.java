package com.example.project.userService;

import com.example.project.DTO.QuestionDto;
import com.example.project.Entity.Question;
import com.example.project.Entity.Theme;

import java.util.List;
import java.util.Optional;

public interface QuestionService  {
    Question saveQuestion(QuestionDto question);
    Question updateQuestion(Question question);
    List<Question> getAllQuestionList();
    void deleteQuestion(long idQ);
    Optional<Question> findQuestion(Question question);

    Optional<Question> findQuestionById(long idQuestion);

}
