package com.thoughtworks.capability.gtb.entrancequiz.service;

import com.thoughtworks.capability.gtb.entrancequiz.model.Trainee;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

// TODO GTB-工程实践: - Responsibility, 数据存储相关的操作，应该由Repository层来做
// TODO GTB-完成度: - 应该使用数据库保存数据
@Service
public class TraineeService {
    private final Map<Integer, Trainee> traineeMap = new HashMap<>();

    public TraineeService() {
        traineeMap.put(1, new Trainee(1, "成吉思汗", false));
        traineeMap.put(2, new Trainee(2, "鲁班七号", false));
        traineeMap.put(3, new Trainee(3, "太乙真人", false));
        traineeMap.put(4, new Trainee(4, "钟无艳", false));
        traineeMap.put(5, new Trainee(5, "花木兰", false));
        traineeMap.put(6, new Trainee(6, "雅典娜", false));
        traineeMap.put(7, new Trainee(7, "芈月", false));
        traineeMap.put(8, new Trainee(8, "白起", false));
        traineeMap.put(9, new Trainee(9, "刘禅", false));
        traineeMap.put(10, new Trainee(10, "庄周", false));
        traineeMap.put(11, new Trainee(11, "马超", false));
        traineeMap.put(12, new Trainee(12, "刘备", false));
        traineeMap.put(13, new Trainee(13, "哪吒", false));
        traineeMap.put(14, new Trainee(14, "大乔", false));
        traineeMap.put(15, new Trainee(15, "蔡文姬", true));
    }

    public List<Trainee> getAllGroupedTrainees() {
        // TODO GTB-工程实践: - "trainee.getGrouped() == true" 可以简化
        return traineeMap.values().stream().filter(trainee ->
                trainee.getGrouped() == true).collect(Collectors.toList());
    }

    public List<Trainee> getAllUngroupedTrainees() {
        return traineeMap.values().stream().filter(trainee ->
                trainee.getGrouped() == false).collect(Collectors.toList());
    }

//    public Map<Integer, Trainee> getAllUngroupedTraineesMap() {
//        Map<Integer, Trainee> ungroupedTraineeMap = new HashMap<>();
//        for (Object key : traineeMap.keySet()) {
//            Trainee obj = (Trainee)traineeMap.get(key);
//            if (!obj.getGrouped()){
//                ungroupedTraineeMap.put(obj.getId(), obj);
//            }
//        }
//        return ungroupedTraineeMap;
//    }

    public Map<Integer, Trainee> getAllTraineesMap() {
        return traineeMap;
    }

    public void addTrainee(String name) {
        // TODO GTB-工程实践: - 计算id的方式不够健壮，可以使用字段保存最大id
        Integer addId = traineeMap.size() + 1;
        traineeMap.put(addId, new Trainee(addId, name, false));
    }

}
