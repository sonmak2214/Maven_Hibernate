package com.maven;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchData 
{
public static void main(String[] args)
{
	//get , load
  Configuration cfg=new Configuration();
  cfg.configure("hibernate.cfg.xml");
  SessionFactory factory=cfg.buildSessionFactory();
  Session session=factory.openSession();
  
  //get-studnet:id
  Studnet s1=(Studnet)session.load(Studnet.class,105);
  System.out.println(s1.getId()+":"+s1.getCity());
  
  Address a1=(Address)session.get(Address.class,1);
  System.out.println(a1.getStreet()+":"+a1.getCity());
  
  session.close();
  factory.close();
  
}
}
