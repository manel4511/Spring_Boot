package com.example.project.Dao;

import com.example.project.Entity.Question;
import com.example.project.Entity.Theme;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface QuestionRepository extends JpaRepository<Question,Long> {
    Optional<Question> findQuestionByNum(int num);
    Optional<List<Question>> findAllByTheme (Theme theme);
}
