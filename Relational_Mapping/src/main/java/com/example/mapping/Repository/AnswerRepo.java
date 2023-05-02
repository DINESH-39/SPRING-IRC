package com.example.mapping.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.mapping.Model.Answer;

public interface AnswerRepo extends JpaRepository<Answer, Integer> {

}
