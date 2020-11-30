package com.thoughtworks.capability.gtb.entrancequiz.controller;

import com.thoughtworks.capability.gtb.entrancequiz.model.Trainee;
import com.thoughtworks.capability.gtb.entrancequiz.service.TraineeService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin(origins = "*")
public class TraineeController {

    private final TraineeService traineeService;

    public TraineeController(TraineeService traineeService) {
        this.traineeService = traineeService;
    }

    // TODO GTB-完成度: - 没有按照要求实现接口，查询未分组学员，查询未分组讲师
    // TODO GTB-完成度: - 接口缺失，删除学员，删除讲师，查询分组
    @GetMapping("/grouped-trainees")
    // TODO GTB-知识点: - 状态码为200时，可以省略@ResponseStatus注解
    @ResponseStatus(HttpStatus.OK)
    public List<Trainee> getAllGroupedTrainees() {
        return traineeService.getAllGroupedTrainees();
    }

    @GetMapping("/ungrouped-trainees")
    @ResponseStatus(HttpStatus.OK)
    public List<Trainee> getAllUngroupedTrainees() {
        return traineeService.getAllUngroupedTrainees();
    }

    @PostMapping("/trainees")
    @ResponseStatus(HttpStatus.CREATED)
    public void addTrainee(@RequestBody String name) {
        traineeService.addTrainee(name);
    }
}
