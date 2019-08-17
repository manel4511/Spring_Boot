package com.example.project.Entity;
import lombok.*;

import javax.persistence.*;
@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
public  class UserApp {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long userId;

    private String firstName;

    private String lastName;

    private String userName;

    private String password;

    private String phone;

    private String email;
}

