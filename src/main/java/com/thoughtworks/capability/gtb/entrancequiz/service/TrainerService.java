package com.thoughtworks.capability.gtb.entrancequiz.service;

import com.thoughtworks.capability.gtb.entrancequiz.model.Trainer;
import com.thoughtworks.capability.gtb.entrancequiz.repo.TrainerRepo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class TrainerService {
    private TrainerRepo trainerRepo;

    public TrainerService(TrainerRepo trainerRepo) {
        this.trainerRepo = trainerRepo;
    }

    public List<Trainer> getAllTrainers() {
        return new ArrayList<>(trainerRepo.getTrainerRepo().values());
    }

    public Map<Integer, Trainer> getAllTrainersMap() {
        return trainerRepo.getTrainerRepo();
    }
}
