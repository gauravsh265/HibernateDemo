package xyz.gauravsharma;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MainClass {

    public static void main(String[] args) {

        Employee e1 = new Employee();
        e1.setId(1);
        e1.setName("Sharma");
        Address address = new Address();
        address.setCity("Mumbai");
        address.setDescription("Started living in Mumbai from 2012. Before That I wasliving in Rajasthan.");
        e1.setAddress(address);

        Address address1 = new Address();
        address1.setCity("Ramgarhs");
        address1.setDescription("Rajasthan.");
        e1.setHomeAddress(address1);

        // Step - 1
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

        // Step - 2
        Session session = sessionFactory.openSession();

        // Step - 3
        session.beginTransaction();
        session.save(e1);
        session.getTransaction().commit();


        e1 = null;

        session.beginTransaction();
        e1 = session.get(Employee.class, 1);
        System.out.println(e1);
        session.close();
        sessionFactory.close();
    }
}
