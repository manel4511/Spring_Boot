package com.example.project.userService;

import com.example.project.DTO.AnswerDto;
import com.example.project.Dao.AnswerRepository;
import com.example.project.Dao.QuestionRepository;
import com.example.project.Entity.Answer;
import com.example.project.Entity.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AnswerServiceImpl implements AnswerService {
    @Autowired
    AnswerRepository answerrepository ;
    @Autowired
    QuestionRepository questionRepository;
  @Override
  public Answer saveAnswer(AnswerDto answerDto) {
      Answer a = new Answer();
      Question question = questionRepository.findQuestionByNum(answerDto.getNum()).get();
      if (question==null) throw new RuntimeException("question n'existe pas");
      a.setLibelleA(answerDto.getLibelleA());
      a.setQuestion(question);
      return answerrepository.save(a);
  }
    @Override
    public Answer updateAnswer(AnswerDto answerDto,long idA){

        Answer a=answerrepository.findById(idA).get();
      a.setLibelleA(answerDto.getLibelleA());
      a.setDescreption(answerDto.isDescreption());
      return answerrepository.save(a);
    }

    @Override
    public List<Answer> getAllAnswerList() {

        return answerrepository.findAll();
    }

    @Override
    public void deleteAnswer(long idA) {
        answerrepository.deleteById(idA);

    }

    @Override
    public void deleteAnswerById(long idA) {
      answerrepository.deleteById(idA);

    }

    @Override
    public Optional<Answer> findAnswer(Answer answer) {

      return answerrepository.findById(answer.getIdA());
    }

    @Override
    public Optional<Answer> findAnswerById(long idA) {

        return answerrepository.findById(idA);
    }
   public void deleteAnswer(Answer answer){
      answerrepository.delete(answer);

   }






}
