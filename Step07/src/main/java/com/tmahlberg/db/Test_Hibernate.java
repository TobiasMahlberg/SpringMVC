package com.tmahlberg.db;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.tmahlberg.todo.Todo;

public class Test_Hibernate
{
    public static void main(String[] args)
    {
        Todo todo = new Todo();
        todo.setDesc("Desc");
        todo.setUser("admin");

        SessionFactory sf       = HibernateUtil.getSessionFactory();
        Session session         = null;
        Transaction transaction = null;

        // Neuen Benutzer in Datenbank speichern:
        try
        {
            session             = sf.getCurrentSession();
            transaction         = session.beginTransaction();
            session.save(todo);
            transaction.commit();
        }
        catch (Exception e)
        {
            // rollback(transaction);
            System.out.println(e.getMessage());
        }
    }
}