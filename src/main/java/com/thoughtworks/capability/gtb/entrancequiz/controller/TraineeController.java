package com.thoughtworks.capability.gtb.entrancequiz.controller;

import com.thoughtworks.capability.gtb.entrancequiz.model.Trainee;
import com.thoughtworks.capability.gtb.entrancequiz.service.TraineeService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@CrossOrigin(origins = "*")
public class TraineeController {

    private final TraineeService traineeService;

    public TraineeController(TraineeService traineeService) {
        this.traineeService = traineeService;
    }

    @GetMapping("/trainees")
    public List<Trainee> getAllTrainees() {
        return traineeService.getAllTrainees();
    }

}
