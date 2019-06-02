package xyz.gauravsharma;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.HashSet;
import java.util.Set;

public class MainClass {

    public static void main(String[] args) {

        Employee e1 = new Employee();
        e1.setId(1);
        e1.setName("Sharma");
        Address address = new Address();
        address.setId(1);
        address.setCity("Mumbai");
        address.setState("Maharashtra");
        address.setDescription("Living in Mumbai since 2012.");
        address.setEmployee(e1);
        e1.setAddress(address);
       /*

        Set<Address> addresses = new HashSet<>();
        addresses.add(address);
        Address address1 = new Address();
        address1.setCity("Ramgarh Shekahwati");
        address1.setState("Rajasthan");
        address1.setDescription("Khamma Ghani !!");
        addresses.add(address1);
        e1.setAddresses(addresses);*/

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
