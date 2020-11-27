package com.thoughtworks.capability.gtb.entrancequiz.service;

import com.thoughtworks.capability.gtb.entrancequiz.model.Trainer;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class TrainerService {
    private final Map<Integer, Trainer> trainerMap = new HashMap<>();

    public TrainerService() {
        trainerMap.put(1, new Trainer(1, "彭梦秋"));
        trainerMap.put(2, new Trainer(2, "董志刚"));
        trainerMap.put(3, new Trainer(3, "周丽"));
        trainerMap.put(4, new Trainer(4, "张钊"));
        trainerMap.put(5, new Trainer(5, "张巍"));
    }

    public List<Trainer> getAllTrainers() {
        return new ArrayList<>(trainerMap.values());

    }
}