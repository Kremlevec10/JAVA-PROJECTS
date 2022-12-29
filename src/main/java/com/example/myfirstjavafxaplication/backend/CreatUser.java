package com.example.myfirstjavafxaplication.backend;

import com.example.myfirstjavafxaplication.backend.entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class CreatUser implements ActionHibernate<User> {
    private SessionFactory sessionFactory;
    InstanceSessionFactory instanceSF;

    @Override
    public void actionWithTable(User user) {
        instanceSF = new InstanceSessionFactory();
        sessionFactory = instanceSF.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(user);
        transaction.commit();
        session.close();

    }
}
