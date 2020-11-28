package com.thoughtworks.capability.gtb.entrancequiz.repo;

import com.thoughtworks.capability.gtb.entrancequiz.model.Trainer;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class TrainerRepo {
    private final Map<Integer, Trainer> trainerMap = new HashMap<>();

    public TrainerRepo() {
        trainerMap.put(1, new Trainer(1, "彭梦秋"));
        trainerMap.put(2, new Trainer(2, "董志刚"));
        trainerMap.put(3, new Trainer(3, "周丽"));
        trainerMap.put(4, new Trainer(4, "张钊"));
        trainerMap.put(5, new Trainer(5, "张巍"));
        trainerMap.put(6, new Trainer(6, "朱玉前"));
        trainerMap.put(7, new Trainer(7, "杜娟"));
        trainerMap.put(8, new Trainer(8, "王雅君"));
        trainerMap.put(9, new Trainer(9, "王晓峰"));
    }

    public Map<Integer, Trainer> getTrainerRepo() {
        return trainerMap;
    }
}
