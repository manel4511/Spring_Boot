package com.example.project.Entity;

import lombok.*;


import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
public class Answer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idA ;
    private String libelleA;
    private boolean descreption ;
    @ManyToOne
    @JoinColumn
    Question question;


}
