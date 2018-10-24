package com.example.postgres.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.postgres.model.Question;

@Repository
public interface QuestionRepository extends JpaRepository<Question,Long>{

	
	
}
