package com.tmahlberg.todo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

import com.tmahlberg.db.HibernateUtil;

@Service("TodoService")
public class TodoServiceClass implements TodoService {

	private static List<Todo> todos = new ArrayList<Todo>();
	private static int todoCount = 3;

	static {
		todos.add(new Todo(1, "admin", "Learn Spring MVC", new Date(), false));
		todos.add(new Todo(2, "admin", "Learn Struts", new Date(), false));
		todos.add(new Todo(3, "admin", "Learn Hibernate", new Date(), false));
	}

	@Override
	public List<Todo> retrieveTodos(String user) {
		List<Todo> filteredTodos = new ArrayList<Todo>();
		for (Todo todo : todos) {
			if (todo.getUser().equals(user))
				filteredTodos.add(todo);
		}
		return filteredTodos;
	}

	public void Test () {
		System.out.print("X");
	}

	@Override
	public Todo retrieveTodo(int id) {
		for (Todo todo : todos) {
			if (todo.getId() == id)
				return todo;
		}
		return null;
	}

	@Override
	public void updateTodo(Todo todo) {
		todos.remove(todo);
		todos.add(todo);
	}

	@Override
	public void addTodo(String name, String desc, Date targetDate, boolean isDone) {

        Todo todo = new Todo(++todoCount, name, desc, targetDate, isDone);

		HibernateUtil db = new HibernateUtil();
        db.beginTransaction();

        db.getSession().save(todo);

        db.commitTransaction();
        db.closeSession();

        todos.add(todo);

	}

	@Override
	public void deleteTodo(int id) {
		Iterator<Todo> iterator = todos.iterator();
		while (iterator.hasNext()) {
			Todo todo = iterator.next();
			if (todo.getId() == id) {
				iterator.remove();
			}
		}
	}
}