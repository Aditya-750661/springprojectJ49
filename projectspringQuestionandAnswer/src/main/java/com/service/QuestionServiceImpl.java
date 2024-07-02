package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.QuestionRepository;
import com.model.Question;

@Service
public class QuestionServiceImpl implements QuestionService {

	@Autowired
	private QuestionRepository questionRepo;
	

	@Override
	public Question saveQuestion(Question q) {
	
		return questionRepo.save(q);
	}


	@Override
	public Question getById(int id) {
		
		return questionRepo.findById(id).orElse(null);
	}



}
