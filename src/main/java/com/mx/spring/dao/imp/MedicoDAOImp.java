package com.mx.spring.dao.imp;

import com.mx.spring.dao.IMedicoDAO;
import com.mx.spring.entities.Medico;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MedicoDAOImp implements IMedicoDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Medico> getAll() {

        Session session = null;
        List<Medico> medicos = null;

        try {

            session = sessionFactory.openSession();

            Query query = session.createQuery("SELECT m FROM Medico m");
            medicos = query.list();
        } catch (Exception e) {

            e.getStackTrace();

        } finally {

            session.close();
        }

        return medicos;
    }

}
