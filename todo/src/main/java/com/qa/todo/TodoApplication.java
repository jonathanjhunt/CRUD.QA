package com.qa.todo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.qa.todo.service.TodoService;

@SpringBootApplication
public class TodoApplication {

	public static void main(String[] args) {
		ApplicationContext ac = SpringApplication.run(TodoApplication.class, args);
		System.out.println(ac.getBean(TodoService.class));
		// DEMO PURPOSES ONLY
	}

}
