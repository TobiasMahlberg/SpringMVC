package com.tmahlberg.login.model;

import java.util.Date;
import java.util.List;

public interface TodoService
{
	public List<Todo> retrieveTodos(String user);

	public void addTodo(String name, String desc, Date targetDate, boolean isDone);

	public void deleteTodo(int id);

}
