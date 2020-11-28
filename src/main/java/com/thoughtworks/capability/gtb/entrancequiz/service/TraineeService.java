package com.thoughtworks.capability.gtb.entrancequiz.service;

import com.thoughtworks.capability.gtb.entrancequiz.model.Trainee;
import com.thoughtworks.capability.gtb.entrancequiz.repo.TraineeRepo;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class TraineeService {
    private final TraineeRepo traineeRepo;

    public TraineeService(TraineeRepo traineeRepo) {
        this.traineeRepo = traineeRepo;
    }

    public List<Trainee> getAllTrainees() {
        return new ArrayList<>(traineeRepo.getTraineeRepo().values());
    }

    public Map<Integer, Trainee> getAllTraineesMap() {
        return traineeRepo.getTraineeRepo();
    }

}
