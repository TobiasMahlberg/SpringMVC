package com.tmahlberg.todo;

import java.util.Date;
import java.util.List;

public interface TodoService
{
	public List<Todo> retrieveTodos(String user);

	public void addTodo(String name, String desc, Date targetDate, boolean isDone);

	public void updateTodo(Todo todo);

	public Todo retrieveTodo(int id);

	public void deleteTodo(int id);

}
