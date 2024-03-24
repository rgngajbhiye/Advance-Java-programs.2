package astericks1.maven_Hibernate1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import astericks1.maven_Hibernate1.model.User;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");
        
        SessionFactory factory = cfg.buildSessionFactory();
        Session session=factory.openSession();
        
        User u=new User("mina", "1234");
        
        Transaction tx= session.beginTransaction();
        session.save(u);
        
        
        
    }
}
