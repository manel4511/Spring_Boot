package com.example.project.DTO;

import com.example.project.Entity.Question;
import lombok.*;
import org.aspectj.weaver.patterns.TypePatternQuestions;


import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class AnswerDto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idA;
    private String  libelleA;
    private boolean descreption;
    private int num;

    private String question ;
   // private Question question;

}
