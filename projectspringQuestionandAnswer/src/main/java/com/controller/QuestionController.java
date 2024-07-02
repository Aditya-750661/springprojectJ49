package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.Question;
import com.service.QuestionService;

@RestController
@RequestMapping("q")
public class QuestionController {

	@Autowired
	private QuestionService questionService;


	@PostMapping("save")
	public Question saveQuestion(@RequestBody Question q) {

		return questionService.saveQuestion(q);
	}
	
	@GetMapping("get/{id}")
	public Question getById(@PathVariable("id") int id) {

		return questionService.getById(id);
	}

}
