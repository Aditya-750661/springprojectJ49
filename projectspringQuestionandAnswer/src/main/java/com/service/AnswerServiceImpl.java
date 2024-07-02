package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.AnswerRepository;
import com.model.Answer;

@Service
public class AnswerServiceImpl implements AnswerService{

	@Autowired
	private AnswerRepository answerRepo;
	
	@Override
	public Answer saveAnswer(Answer a) {
	
		return answerRepo.save(a);
	}

	@Override
	public Answer getById(int id) {
		
		return answerRepo.findById(id).orElse(null);
	}

}
