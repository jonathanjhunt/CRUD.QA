package com.qa.todo.rest;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.qa.todo.persistence.domain.Todo;
import com.qa.todo.service.TodoService;

// ctrl + space  /// ctrl + shift + o
@CrossOrigin
@RestController
public class TodoController {

	private TodoService service;

	public TodoController(TodoService service) {
		super();
		this.service = service;
	}

	@GetMapping("/greeting")
	public String greeting() {
		return "Hello, World!";
	}

	@PostMapping("/create")
	public ResponseEntity<Todo> createTodo(@RequestBody Todo todo) {
		return new ResponseEntity<Todo>(this.service.createTodo(todo), HttpStatus.CREATED);
	}

	@GetMapping("/get")
	public ResponseEntity<List<Todo>> getTodo() {
		return ResponseEntity.ok(this.service.getTodo());
	}

	@PutMapping("/update")
	public ResponseEntity<Todo> updateTodo(@RequestBody Todo todo, @PathParam("id") Long id) {
		return new ResponseEntity<Todo>(this.service.updateTodo(todo, id), HttpStatus.ACCEPTED);
	}

	@DeleteMapping("/remove/{id}")
	public ResponseEntity<Object> deleteTodo(@PathVariable Long id) {
		if (this.service.deleteTodo(id)) {
			return new ResponseEntity<>(HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
