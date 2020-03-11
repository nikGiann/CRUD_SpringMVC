package com.asterixnick.dao;

import com.asterixnick.entities.Trainer;
import java.util.List;
import javax.persistence.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class TrainerDaoImpl implements TrainerDao {

    @Autowired
    private SessionFactory sessionFactory;

    private Session getSession() {
        return sessionFactory.getCurrentSession();
    }

    @Override
    public List<Trainer> findAll() {
        Query q = getSession().createQuery("SELECT t FROM Trainer t");
        List<Trainer> list = q.getResultList();
        return list;
    }

    @Override
    public void createOrUpdate(Trainer c) {
        getSession().saveOrUpdate(c);
    }

    @Override
    public void delete(int id) {
        Trainer t = getSession().getReference(Trainer.class, id);
        getSession().delete(t);
    }

    @Override
    public Trainer findById(Integer id) {
        return (Trainer)getSession().get(Trainer.class, id);
        
    }

    @Override
    public List<Trainer> findTrainerByName(String searchName) {
        Query q =getSession().createNamedQuery("Trainer.findLikeName");
        q.setParameter("name", "%"+searchName+"%");
        List<Trainer> list = q.getResultList();
        return list;
    }

}
