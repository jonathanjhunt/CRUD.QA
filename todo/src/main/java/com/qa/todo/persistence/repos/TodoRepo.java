package com.qa.todo.persistence.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qa.todo.persistence.domain.Todo;


@Repository
public interface TodoRepo extends JpaRepository<Todo, Long> {

}