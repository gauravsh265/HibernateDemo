package xyz.gauravsharma;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MainClass {

    public static void main(String[] args) {

        Employee e1 = new Employee();
        e1.setId(1);
        e1.setName("Sharma");

        // Step - 1
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

        // Step - 2
        Session session = sessionFactory.openSession();

        // Step - 3
        session.beginTransaction();
        session.save(e1);
        session.getTransaction().commit();

        session.close();
        sessionFactory.close();
    }
}
