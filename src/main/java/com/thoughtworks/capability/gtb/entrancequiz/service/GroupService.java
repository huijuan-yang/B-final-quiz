package com.thoughtworks.capability.gtb.entrancequiz.service;

import com.thoughtworks.capability.gtb.entrancequiz.model.Group;
import com.thoughtworks.capability.gtb.entrancequiz.model.Trainee;
import com.thoughtworks.capability.gtb.entrancequiz.model.Trainer;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class GroupService {
    // TODO GTB-知识点: - Service之间不应该互相调用
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
        // TODO GTB-完成度: - 分组时没有处理讲师不够的情况
        int groupSize = allTrainersMap.size() / 2;
        for (int i = 0; i < groupSize; i++) {
            // TODO GTB-工程实践: - Code Smell, Magic Number
            // TODO GTB-工程实践: - Style, 注意代码风格，哪儿应该加空格，哪儿应该不加空格
            // TODO GTB-知识点: - 了解下Java7的钻石操作符
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
        // TODO GTB-工程实践: - Generic, 没有使用泛型
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
            // TODO GTB-工程实践: - 多注意下IDEA的报灰或警告，要及时修复
            Trainer obj = (Trainer)allTrainersMap.get(o);
            obj.setGrouped(true);
            groupMap.get(groupNumber).getGroupTrainers().add(obj);
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
            Trainee obj = (Trainee)allTraineesMap.get(o);
            obj.setGrouped(true);
            groupMap.get(groupNumber).getGroupTrainees().add(obj);
            groupNumber ++;
        }
    }
}
