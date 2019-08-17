package com.example.project.userService;

import com.example.project.DTO.AnswerDto;
import com.example.project.Entity.Answer;
import com.example.project.Entity.Theme;

import java.util.List;
import java.util.Optional;

public interface AnswerService {
    Answer saveAnswer(AnswerDto answerDto);
    Answer updateAnswer(AnswerDto answerDto,long idA);
    List<Answer> getAllAnswerList();
    void deleteAnswer(long idA);
    void deleteAnswerById(long idA);
    Optional<Answer> findAnswer(Answer answer);
    Optional<Answer> findAnswerById(long idA);
    void deleteAnswer(Answer answer);
}
