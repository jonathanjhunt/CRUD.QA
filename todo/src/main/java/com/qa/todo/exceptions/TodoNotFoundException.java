package com.qa.todo.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Task does not exist with that ID")
public class TodoNotFoundException extends RuntimeException {

}
