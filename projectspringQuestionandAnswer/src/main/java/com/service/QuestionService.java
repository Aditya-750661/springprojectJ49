package com.service;

import com.model.Question;

public interface QuestionService {
	
	public Question saveQuestion(Question q);

	public Question getById(int id);
}
