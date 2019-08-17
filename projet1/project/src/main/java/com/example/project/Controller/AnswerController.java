package com.example.project.Controller;


import com.example.project.DTO.AnswerDto;
import com.example.project.Dao.AnswerRepository;
import com.example.project.Dao.QuestionRepository;
import com.example.project.Entity.Answer;
import com.example.project.Entity.Question;
import com.example.project.userService.AnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class AnswerController {
    @Autowired
    AnswerService answerservice;
    @Autowired
    QuestionRepository questionRepository;
    @Autowired
    AnswerRepository answerRepository;
    @RequestMapping(method = RequestMethod.POST, value = "/addanswer")
    public Answer addAnswer(@RequestBody AnswerDto answer) {

        return answerservice.saveAnswer(answer);
    }

    @GetMapping("/allanswer")
    public List<Answer> getAllAnswer() {

        return answerservice.getAllAnswerList();
    }
    @RequestMapping("/{idA}")
    public Optional<Answer> findById(@PathVariable long idA){

        return answerservice.findAnswerById(idA);
    }
    @PutMapping("/{idA}")
    @RequestMapping(method = RequestMethod.PUT, value = "/updateanswer")
    public void updateanswer(@RequestBody AnswerDto answerDto,@PathVariable long idA) {
        answerservice.updateAnswer(answerDto,idA);

    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{idA}")
    public void deleteanswer(@PathVariable long idA) {

        answerservice.deleteAnswer(idA);
    }
   /* @PostMapping ("/answer")
    public List<Answer> answerGet(@RequestBody AnswerDto answerDto){

        Question question = questionRepository.findQuestionByNum(answerDto.getNum()).get();
        if (question==null) throw new RuntimeException("there is no question");

        return  answerRepository.findAllByQuestion(question).get();
    }
*/

}
