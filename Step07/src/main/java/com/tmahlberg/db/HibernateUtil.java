package com.tmahlberg.db;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

import com.tmahlberg.todo.Todo;

public class HibernateUtil
{
    private static SessionFactory sessionFactory;

    static
    {
        try
        {
            sessionFactory = new AnnotationConfiguration()
                                .addPackage("de.bennyn.example.hibernate")
                                .addAnnotatedClass(Todo.class)
                                .configure()
                                .buildSessionFactory();
        }
        catch (RuntimeException ex)
        {
            System.out.println(ex.getMessage());
        }
    }

    public static SessionFactory getSessionFactory()
    {
        return sessionFactory;
    }
}