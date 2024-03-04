package com.maven;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args ) throws IOException
    { 
        System.out.println( "Hello World!" );
        SessionFactory factory=new Configuration().configure().buildSessionFactory();  

Session session=factory.openSession();
Transaction tx=session.beginTransaction();


        //create student
        Studnet  s1=new Studnet();
        s1.setId(105);
        s1.setName("Sonmak");
        s1.setCity("Vadodara");
        System.out.println(s1);
        
        Address a1=new Address();
        a1.setId(1);
        a1.setStreet("Sinhgad");
        a1.setCity("Pune");
        a1.setIs_open(true);
        a1.setAddedDate(new Date());
        a1.setX(1368.342);
        
        //FileInputStream fin=new FileInputStream("src/main/java/call.png");
        //byte[]data=new byte[fin.available()]; 
        //fin.read(data);
       // a1.setImage(data);
        
        session.save(s1);
        session.save(a1);
        tx.commit();
        session.close();
        System.out.println("Done....");
        
    }
}
