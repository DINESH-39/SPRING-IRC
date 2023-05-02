package com.example.mapping.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.mapping.Model.Question;

public interface QuestionRepo extends JpaRepository<Question, Integer> {

}
