package com.thoughtworks.capability.gtb.entrancequiz.repo;

import com.thoughtworks.capability.gtb.entrancequiz.model.Trainee;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class TraineeRepo {

    private final Map<Integer, Trainee> traineeMap = new HashMap<>();

    public TraineeRepo() {
        traineeMap.put(1, new Trainee(1, "成吉思汗"));
        traineeMap.put(2, new Trainee(2, "鲁班七号"));
        traineeMap.put(3, new Trainee(3, "太乙真人"));
        traineeMap.put(4, new Trainee(4, "钟无艳"));
        traineeMap.put(5, new Trainee(5, "花木兰"));
        traineeMap.put(6, new Trainee(6, "雅典娜"));
        traineeMap.put(7, new Trainee(7, "芈月"));
        traineeMap.put(8, new Trainee(8, "白起"));
        traineeMap.put(9, new Trainee(9, "刘禅"));
        traineeMap.put(10, new Trainee(10, "庄周"));
        traineeMap.put(11, new Trainee(11, "马超"));
        traineeMap.put(12, new Trainee(12, "刘备"));
        traineeMap.put(13, new Trainee(13, "哪吒"));
        traineeMap.put(14, new Trainee(14, "大乔"));
        traineeMap.put(15, new Trainee(15, "蔡文姬"));
    }

    public Map<Integer, Trainee> getTraineeRepo() {
        return traineeMap;
    };
}
