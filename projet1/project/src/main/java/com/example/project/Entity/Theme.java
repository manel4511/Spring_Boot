package com.example.project.Entity;

import lombok.*;
import javax.persistence.*;



@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Theme {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idTheme ;
    private String name;

}
