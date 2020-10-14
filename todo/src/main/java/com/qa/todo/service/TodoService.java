package com.qa.todo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.qa.todo.exceptions.TodoNotFoundException;
import com.qa.todo.persistence.domain.Todo;
import com.qa.todo.persistence.repos.TodoRepo;

//@Component
@Service
public class TodoService {

//	@Autowired
	private TodoRepo repo;

	public TodoService(TodoRepo repo) {
		super();
		this.repo = repo;
	}

	public Todo createTodo(Todo todo) {
		return this.repo.save(todo);
	}

	public List<Todo> getTodo() {
		return this.repo.findAll();
	}

	public Todo updateTodo(Todo todo, Long id) {
		// If doesn't find a matching Wood, throw exception
		Todo oldTodo = this.repo.findById(id).orElseThrow(() -> new TodoNotFoundException());

		oldTodo.setSubject(todo.getSubject());
		oldTodo.setDate(todo.getDate());
		oldTodo.setTask(todo.getTask());
		
		return this.repo.save(oldTodo);
	}

	public boolean deleteTodo(Long id) {
		this.repo.deleteById(id);
		return !this.repo.existsById(id);
	}
}
