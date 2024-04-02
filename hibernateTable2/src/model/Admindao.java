package model;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.Query;


public class Admindao {
	
	public List<Adminentity2> show()
	{
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		//xml file didint assign here 

		SessionFactory factory=cfg.buildSessionFactory();
		Session session =factory.openSession();
		Transaction tx=session.beginTransaction();
		
		Query query=session.createQuery("from Adminentity2");
		List<Adminentity2> ul=query.list();
		tx.commit();
		session.close();
		return ul;
		
	}
	public Adminentity2 getoneuser(int id)
	{
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		//xml file didint assign here 
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		
		Query query=session.createQuery("from Adminentity2 where id=:i");
		query.setParameter("i", id);
		//uid not "id" only id
		List<Adminentity2> al=query.list();
		Adminentity2 ad=al.get(0);
		tx.commit();
		factory.close();
		return ad;
		
	}
	
	
/*
	public List<User> Show() {
		
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory factory =cfg.buildSessionFactory();
		Session session =factory.openSession();
		
		Transaction tx =session.beginTransaction();
		
		Query query=session.createQuery("from User");
		
		List<User> ul= query.list();
		tx.commit();
		session.close();
		factory.close();
		
		
		return ul;
		
		
		
	}
	
	public User getOneUser(int id) {
		
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		Session session =factory.openSession();
		Transaction tx=session.beginTransaction();
		
		Query query =session.createQuery("from User where id =:i");
		query.setParameter("i", id);
		
		List<User> ul=query.list();
		User u=ul.get(0);
		tx.commit();
		session.close();
		factory.close();
		return u;
	}
	
	public User DeleteOneId(int id) {
		
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		Session session =factory.openSession();
		Transaction tx=session.beginTransaction();
		
		Query query =session.createQuery("from User where id=:i");
		query.setParameter("i", id);
		
		List<User> ul=query.list();
		User u=ul.get(0);
		tx.commit();
		session.close();
		factory.close();
		return u;
		
	}
	*/
}
