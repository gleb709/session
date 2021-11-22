package by.innowisegroup.session;

import by.innowisegroup.session.entity.Book;
import by.innowisegroup.session.entity.Author;
import by.innowisegroup.session.entity.Farm;
import by.innowisegroup.session.session.MySessionFactory;
import org.hibernate.Session;

import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) {
        Session session = MySessionFactory.getSessionFactory().openSession();
        session.getTransaction().begin();
        System.out.println(session.getTransaction().getStatus());

        session.save(new Farm());

        session.getTransaction().commit();
        System.out.println(session.getTransaction().getStatus());
        session.close();
    }

}