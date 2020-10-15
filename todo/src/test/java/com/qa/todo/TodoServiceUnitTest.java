package com.qa.todo;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.qa.todo.persistence.domain.Todo;
import com.qa.todo.persistence.repos.TodoRepo;
import com.qa.todo.service.TodoService;

@SpringBootTest
public class TodoServiceUnitTest {
	@Autowired
	private TodoService service;
	
	@MockBean
	private TodoRepo repo;
	
	@Test
	void testCreate() {
		Long id = 1L;
		Todo newTodo = new Todo("shopping", "22/08/2019", "get eggs");
		Todo savedTodo = new Todo("shopping", "22/08/2019", "get eggs");
		savedTodo.setId(id);
		
		Mockito.when(this.repo.save(newTodo)).thenReturn(savedTodo);
		
		assertThat(this.service.createTodo(newTodo)).isEqualTo(savedTodo);
	}
	@Test
	void testUpdate() {
		Long id = 1L;
		Todo newTodo = new Todo("shopping", "22/08/2019", "get eggs");
		Todo oldTodo = new Todo("shopping 2", "23/08/2019", "get eggs and milk");
		
		oldTodo.setId(id);;
		
		Todo updatedTodo = new Todo("shopping", "22/08/2019", "get eggs");
		updatedTodo.setId(id);
		
		Mockito.when(this.repo.findById(id)).thenReturn(Optional.of(oldTodo));
		Mockito.when(this.repo.save(updatedTodo)).thenReturn(updatedTodo);
		
		assertThat(this.service.updateTodo(newTodo, id)).isEqualTo(updatedTodo);
		
		Mockito.verify(this.repo, Mockito.times(1)).findById(id);
		Mockito.verify(this.repo, Mockito.times(1)).save(updatedTodo);
		
		
	}
	@Test
	void testGet() {
		Todo todo = new Todo("shopping 2", "23/08/2019", "get eggs and milk");
		todo.setId(1L);
		List<Todo> todos = new ArrayList<>();
		todos.add(todo);
		Mockito.when(this.repo.findAll()).thenReturn(todos);
		assertThat(this.service.getTodo()).isEqualTo(todos);
		Mockito.verify(this.repo, Mockito.times(1)).findAll();
	}
	
	@Test
	void testDelete() {
		// GIVEN
		Long id = 1L;
		boolean found = false;

		// WHEN
		Mockito.when(this.repo.existsById(id)).thenReturn(found);

		// THEN
		assertThat(this.service.deleteTodo(id)).isEqualTo(!found);

		Mockito.verify(this.repo, Mockito.times(1)).existsById(id);
	}
}
