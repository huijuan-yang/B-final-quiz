package com.thoughtworks.capability.gtb.entrancequiz.service;

import com.sun.tools.javac.code.Attribute;
import com.thoughtworks.capability.gtb.entrancequiz.model.Group;
import com.thoughtworks.capability.gtb.entrancequiz.model.Trainee;
import com.thoughtworks.capability.gtb.entrancequiz.model.Trainer;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class GroupService {
    private final TrainerService trainerService;
    private final TraineeService traineeService;

    private Map<Integer, Group> groupMap = new HashMap<>();

    public GroupService(TrainerService trainerService, TraineeService traineeService) {
        this.trainerService = trainerService;
        this.traineeService = traineeService;
    }

    public List<Group> getAllGroups() {
        Map<Integer, Trainer> allTrainersMap = trainerService.getAllTrainersMap();
        Map<Integer, Trainee> allTraineesMap = traineeService.getAllTraineesMap();
        int groupSize = allTrainersMap.size() / 2;
        for (int i = 0; i < groupSize; i++) {
            groupMap.put(i+1, new Group(i+1, i+1+" 组", new ArrayList<Trainer>(), new ArrayList<Trainee>()));
        }
        return shuffleAll(groupSize, allTrainersMap, allTraineesMap);
    }

    private List<Group> shuffleAll(int groupSize, Map<Integer, Trainer> allTrainersMap, Map<Integer, Trainee> allTraineesMap) {
        shuffleTrainers(groupSize, allTrainersMap);
        shuffleTrainees(groupSize, allTraineesMap);
        return new ArrayList<>(groupMap.values());
    }

    private void shuffleTrainers(int groupSize, Map<Integer, Trainer> allTrainersMap) {
        List trainersKeys = new ArrayList(allTrainersMap.keySet());
        Collections.shuffle(trainersKeys);
        if (trainersKeys.size()%2 != 0) {
            trainersKeys.remove(trainersKeys.size() - 1);
        }
        int groupNumber = 1;
        for (Object o : trainersKeys) {
            if (groupNumber > groupSize) {
                groupNumber = 1;
            }
            groupMap.get(groupNumber).getGroupTrainers().add(allTrainersMap.get(o));
            groupNumber ++;
        }
    }

    private void shuffleTrainees(int groupSize, Map<Integer, Trainee> allTraineesMap) {
        List traineesKeys = new ArrayList(allTraineesMap.keySet());
        Collections.shuffle(traineesKeys);
        int groupNumber = 1;
        for (Object o : traineesKeys) {
            if (groupNumber > groupSize) {
                groupNumber = 1;
            }
            groupMap.get(groupNumber).getGroupTrainees().add(allTraineesMap.get(o));
            groupNumber ++;
        }
    }
}
