package com.tmahlberg.db;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;


public class HibernateUtil
{

	private StandardServiceRegistry ssr;
	private Metadata meta;
	private SessionFactory factory;
	private Session session;

	public HibernateUtil () {

		setSsr(new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build());
		setMeta(new MetadataSources(ssr).getMetadataBuilder().build());

	}

	public void setSsr(StandardServiceRegistry ssr) {
		this.ssr = ssr;
	}

	public StandardServiceRegistry getSsr() {
		return this.ssr;
	}

	public void setMeta(Metadata meta) {
		this.meta = meta;
	}

	public Metadata getMeta() {
		return this.meta;
	}

	public void setSessionFactory(SessionFactory factory) {
		this.factory = factory;
	}

	public SessionFactory getSessionFactory() {
		return this.factory;
	}

	public void setSession(Session session) {
		this.session = session;
	}

	public Session getSession() {
		return this.session;
	}

	public Transaction beginTransaction() {

		setSessionFactory(meta.getSessionFactoryBuilder().build());
    	setSession(getSessionFactory().openSession());

		return session.beginTransaction();
	}

	public void commitTransaction(Transaction t) {
		t.commit();
	}

	public void closeSession() {
		this.factory.close();
	    this.session.close();
	}

}