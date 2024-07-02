package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.Answer;
import com.service.AnswerService;

@RestController
@RequestMapping("/a")
public class AnswerController {

	@Autowired
	private AnswerService answerService;

	@PostMapping("save")
	public Answer saveAnswer(Answer a) {

		return answerService.saveAnswer(a);
	}

	@GetMapping("get/{id}")
	public Answer getById(@PathVariable("id") int id) {
System.out.println("heloo world");
		return answerService.getById(id);
	}

}
