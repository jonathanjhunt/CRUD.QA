package com.qa.todo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.qa.todo.persistence.domain.Todo;

import nl.jqno.equalsverifier.EqualsVerifier;

@SpringBootTest
class TodoApplicationTests {

	@Test
	void contextLoads() {
	}
	
	@Test
	void coverage() {
		EqualsVerifier.forClass(Todo.class).usingGetClass().verify();
	}

}
