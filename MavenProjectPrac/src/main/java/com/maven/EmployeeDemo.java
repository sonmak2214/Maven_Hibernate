package com.maven;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmployeeDemo
{
  public static void main(String[] args) 
  {
	Configuration cfg=new Configuration();
	cfg.configure("hibernate.cfg.xml");
	SessionFactory factory=cfg.buildSessionFactory();
	
	Studnet s1=new Studnet();
	s1.setId(26);
	s1.setName("Sonal");
	s1.setCity("Nashik");
	
	Certificate c1=new Certificate();
	c1.setCourse("Dotnet Devloper");
	c1.setDuration("5 Month");
	s1.setCerti(c1);
	
	Studnet s2=new Studnet();
	s2.setId(36);
	s2.setName("Makarand");
	s2.setCity("Banglore");
	
	Certificate c2=new Certificate();
	c2.setCourse("Pyton Devloper");
	c2.setDuration("6 Month");
	s2.setCerti(c2);
	
	Session s=factory.openSession();
	Transaction t1=s.beginTransaction();
	
	s.save(s1);
	s.save(s2);
	
	t1.commit();
	s.close();
	factory.close();
	
  }
}
