package com.example.project.DTO;

import com.example.project.Entity.Theme;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class QuestionDto {


        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private long idQuestion ;
        private String libelle;
        private String theme;
    //private Theme theme;


}
