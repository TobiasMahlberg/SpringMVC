package com.tmahlberg.todo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Service;

import com.tmahlberg.db.HibernateUtil;

@Service("TodoService")
public class TodoServiceClass implements TodoService {

	private static List<Todo> todos = new ArrayList<Todo>();
	private static HibernateUtil db;

	public TodoServiceClass () {
		db = new HibernateUtil();

	}

	@Override
	public List<Todo> retrieveTodos(String user) {

		db.beginTransaction();

		Query q = db.getSession().createQuery("from Todo where username=:u");
	    q.setParameter("u", user);
	    todos = q.list();

	    db.commitTransaction();
        db.closeTransaction();

		return todos;
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
		db.beginTransaction();

		Object obj = db.getSession().load(Todo.class, new Integer(todo.getId()));

	    Todo db_todo = (Todo) obj;
		db.getSession().delete(db_todo);

		db.getSession().save(todo);

        db.commitTransaction();
        db.closeTransaction();

		todos.remove(todo);
		todos.add(todo);

	}

	@Override
	public void addTodo(String name, String desc, Date targetDate, boolean isDone) {

        Todo todo = new Todo(name, desc, targetDate, isDone);

		try {

			db.beginTransaction();
			db.getSession().save(todo);
	        db.commitTransaction();
	        db.closeTransaction();

		} catch (Exception e) {
			e.printStackTrace();
		}

        todos.add(todo);

	}

	@Override
	public void deleteTodo(int id) {
		Iterator<Todo> iterator = todos.iterator();
		while (iterator.hasNext()) {
			Todo todo = iterator.next();
			if (todo.getId() == id) {

				System.out.println(todo.getId());

				try {
					db.beginTransaction();

					Object obj = db.getSession().load(Todo.class, new Integer(todo.getId()));
				    Todo db_todo = (Todo) obj;
					db.getSession().delete(db_todo);

			        db.commitTransaction();
			        db.closeTransaction();
				} catch (Exception e) {
					e.printStackTrace();
				}

				iterator.remove();
			}
		}
	}
}