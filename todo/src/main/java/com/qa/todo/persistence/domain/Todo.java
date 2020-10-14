package com.qa.todo.persistence.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

// ORM - Object Relational Mapper - converts classes to tables

@Entity
public class Todo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String subject;

	private String date;

	private String task;


	public Todo() { // REQUIRED
		super();
	}

	public Todo(String subject, String date, String task) {
		super();
		this.subject = subject;
		this.date = date;
		this.task = task;
		
	}

	@Override
	public String toString() {
		return "Wood [Subject=" + subject + ", date=" + date + ", task=" + task +"]";
	}

	// REQUIRED
	

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTask() {
		return task;
	}

	public void setTask(String task) {
		this.task = task;
	}

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
