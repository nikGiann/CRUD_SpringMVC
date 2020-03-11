
package com.asterixnick.service;

import com.asterixnick.entities.Trainer;
import java.util.List;


public interface TrainerService {
    
    List<Trainer> getAllTrainers();

    public void createOrUpdateTrainer(Trainer t);

    public void deleteTrainer(int id);

    public Trainer findTrainerById(int id);

    public List<Trainer> findTrainerByName(String searchName);
    
}
