package models;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;


public class customerDao {

    SessionFactory factory = new Configuration()
            .configure("hibernate.cfg.xml")
            .addAnnotatedClass(customers.class)
            .buildSessionFactory();

    public List<customers> listcustomers(){
        Session session = factory.getCurrentSession();
        session.beginTransaction();
        List customer = session.createQuery("from customers ").getResultList();
//        session.getTransaction().commit();
        return customer;


    }

    public customers getcustomer(int id)
    {
        Session session= factory.getCurrentSession();
        session.beginTransaction();
        customers customer = session.get(customers.class,id);
        customer.getName();
        customer.getEmail();
        customer.getCurrentbal();
        session.getTransaction().commit();

        return customer;
    }

    public customers updatecustomer(int id, int amount)
    {
        Session session = factory.getCurrentSession();
        session.beginTransaction();
        customers customer = session.get(customers.class,id);
        customer.setCurrentbal(amount);
        session.getTransaction().commit();
        return customer;
    }
}
