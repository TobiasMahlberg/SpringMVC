package com.tmahlberg.db;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateUtil
{

    private SessionFactory factory;
	private Session session;
	private Transaction tx;
	private Configuration cfg;


	public HibernateUtil () {
		this.cfg = new Configuration().configure();
		this.factory = cfg.buildSessionFactory();
	}

	public void setSession(Session session) {
		this.session = session;
	}

	public Session getSession() {
		return this.session;
	}

	public void beginTransaction() {
	    this.session = factory.openSession();
		this.tx = this.session.beginTransaction();
	}

	public void commitTransaction() {
		this.tx.commit();
	}

	public void closeTransaction() {
	    this.session.close();
	}

	public void closeFactory() {
		this.factory.close();
	}

}