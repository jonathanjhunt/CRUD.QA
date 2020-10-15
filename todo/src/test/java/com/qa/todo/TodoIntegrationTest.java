package com.qa.todo;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.jdbc.Sql.ExecutionPhase;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.ResultMatcher;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.qa.todo.persistence.domain.Todo;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc

@Sql(scripts = { "classpath:todo-schema.sql",
				"classpath:todo-data.sql" }, executionPhase = ExecutionPhase.BEFORE_TEST_METHOD)
@ActiveProfiles(profiles = "test")
public class TodoIntegrationTest {
	@Autowired
	private MockMvc mockMvc;
	@Autowired
	private ObjectMapper mapper;
	
	@Test
	void testCreate() throws Exception {
		Todo newTodo = new Todo("shopping", "15/10/2020", "get eggs");
		
		String requestBody = this.mapper.writeValueAsString(newTodo);
		
		RequestBuilder request = post("/create").contentType(MediaType.APPLICATION_JSON).content(requestBody);
		
		ResultMatcher checkStatus = status().is(201);
		
		Todo savedTodo = new Todo("shopping", "15/10/2020", "get eggs");
		
		savedTodo.setId(2L);
		
		String resultBody = this.mapper.writeValueAsString(savedTodo);
		
		ResultMatcher checkBody =content().json(resultBody);
		
		this.mockMvc.perform(request).andExpect(checkStatus).andExpect(checkBody);
		
		MvcResult result = this.mockMvc.perform(request).andExpect(checkStatus).andReturn();
		
		String reqBody = result.getResponse().getContentAsString();
		
		Todo todoResult = this.mapper.readValue(reqBody, Todo.class);
		
		
	}
	
	@Test
	void testUpdate() throws Exception {
		
		Todo newTodo = new Todo("shopping", "15/10/2020", "get eggs");
		
		String requestBody = this.mapper.writeValueAsString(newTodo);
		
		RequestBuilder request = put("/update?id=1").contentType(MediaType.APPLICATION_JSON).content(requestBody);

		ResultMatcher checkStatus = status().isAccepted();

		Todo savedTodo = new Todo("shopping", "15/10/2020", "get eggs");
		
		savedTodo.setId(1L);

		String resultBody = this.mapper.writeValueAsString(savedTodo);
		
		ResultMatcher checkBody = content().json(resultBody);

		this.mockMvc.perform(request).andExpect(checkStatus).andExpect(checkBody);
		
	}
	
	@Test
	void testDelete() throws Exception {
		
		RequestBuilder request = delete("/remove/1");

		ResultMatcher checkStatus = status().is(200);

		this.mockMvc.perform(request).andExpect(checkStatus);


	}
	
	@Test
	void testRead() throws Exception {
		Todo todo = new Todo("new car", "14/10/2020", "get new pump");
		todo.setId(1L); // wood object to match the one in wood-data.sql
		List<Todo> todos = new ArrayList<>();
		todos.add(todo);
		String responseBody = this.mapper.writeValueAsString(todos);

		this.mockMvc.perform(get("/get")).andExpect(status().isOk()).andExpect(content().json(responseBody));
	}
}


