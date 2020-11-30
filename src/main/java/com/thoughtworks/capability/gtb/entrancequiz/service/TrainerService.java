package com.thoughtworks.capability.gtb.entrancequiz.service;

// TODO GTB-工程实践: - Unused, 未使用的import语句
import com.thoughtworks.capability.gtb.entrancequiz.model.Trainee;
import com.thoughtworks.capability.gtb.entrancequiz.model.Trainer;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class TrainerService {
    private final Map<Integer, Trainer> trainerMap = new HashMap<>();

    public TrainerService() {
        trainerMap.put(1, new Trainer(1, "彭梦秋", false));
        trainerMap.put(2, new Trainer(2, "董志刚", false));
        trainerMap.put(3, new Trainer(3, "周丽", false));
        trainerMap.put(4, new Trainer(4, "张钊", false));
        trainerMap.put(5, new Trainer(5, "张巍", false));
        trainerMap.put(6, new Trainer(6, "朱玉前", false));
        trainerMap.put(7, new Trainer(7, "杜娟", false));
        trainerMap.put(8, new Trainer(8, "王雅君", false));
        trainerMap.put(9, new Trainer(9, "王晓峰", false));
    }

    public List<Trainer> getAllGroupedTrainers() {
        return trainerMap.values().stream().filter(trainer ->
                trainer.getGrouped() == true).collect(Collectors.toList());
    }

    public List<Trainer> getAllUngroupedTrainers() {
        return trainerMap.values().stream().filter(trainer ->
                trainer.getGrouped() == false).collect(Collectors.toList());
    }

//    public Map<Integer, Trainer> getAllUngroupedTrainersMap() {
//        Map<Integer, Trainer> ungroupedTrainerMap = new HashMap<>();
//        for (Object key : trainerMap.keySet()) {
//            Trainer obj = (Trainer)trainerMap.get(key);
//            if (!obj.getGrouped()){
//                ungroupedTrainerMap.put(obj.getId(), obj);
//            }
//        }
//        return ungroupedTrainerMap;
//    }

    public Map<Integer, Trainer> getAllTrainersMap() {
        return trainerMap;
    }

    public void addTrainer(String name) {
        Integer addId = trainerMap.size() + 1;
        trainerMap.put(addId, new Trainer(addId, name, false));
    }
}
