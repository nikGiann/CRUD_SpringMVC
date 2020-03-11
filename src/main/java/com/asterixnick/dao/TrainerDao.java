
package com.asterixnick.dao;

import com.asterixnick.entities.Trainer;
import java.util.List;


public interface TrainerDao {

    List<Trainer> findAll();

    public void createOrUpdate(Trainer t);

    public void delete(int id);

    public Trainer findById(Integer id);

    public List<Trainer> findTrainerByName(String searchName);
}
