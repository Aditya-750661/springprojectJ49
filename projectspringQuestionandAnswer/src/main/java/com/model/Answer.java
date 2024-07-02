package com.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Answer {

	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	private int AnswerId;
	
	private String answerName;
	
	@OneToOne(mappedBy = "answer",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JsonIgnore
	private Question question;

	public Answer() {
		super();
	
	}

	public Answer(int answerId, String answerName, Question question) {
		super();
		AnswerId = answerId;
		this.answerName = answerName;
		this.question = question;
	}

	public int getAnswerId() {
		return AnswerId;
	}

	public void setAnswerId(int answerId) {
		AnswerId = answerId;
	}

	public String getAnswerName() {
		return answerName;
	}

	public void setAnswerName(String answerName) {
		this.answerName = answerName;
	}

	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}
}
