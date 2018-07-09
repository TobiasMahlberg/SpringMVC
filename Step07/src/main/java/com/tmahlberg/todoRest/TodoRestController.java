package com.tmahlberg.todoRest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.tmahlberg.todo.Todo;
import com.tmahlberg.todo.TodoService;

@RestController
public class TodoRestController {

	@Autowired
	private TodoService service;

	@RequestMapping(value = "/todo/", method = RequestMethod.GET)
	@ResponseBody
	public String listAllTodos() {
		List<Todo> users = service.retrieveTodos("admin");
		return users.toString();
	}

	@RequestMapping(value = "/todo/{id}", method = RequestMethod.GET)
	@ResponseBody
	public String retrieveTodo(@PathVariable("id") int id) {
		return service.retrieveTodo(id).toString();
	}

}