package com.example.myfirstjavafxaplication.backend;

import com.example.myfirstjavafxaplication.backend.entity.User;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class InstanceSessionFactory {

    private  SessionFactory instanceSessionFactory;
    private Configuration configuration;

    public InstanceSessionFactory() {
        getConfiguration();
    }

    public  SessionFactory getSessionFactory() {
        if (instanceSessionFactory == null) {
            instanceSessionFactory = configuration.buildSessionFactory();
        }
        return instanceSessionFactory;
    }

    private void getConfiguration() {
        configuration = new Configuration().configure();
        configuration.addAnnotatedClass(User.class);
    }

}
