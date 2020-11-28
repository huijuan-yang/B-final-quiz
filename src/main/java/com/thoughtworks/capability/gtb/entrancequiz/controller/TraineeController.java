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

    @GetMapping("/grouped-trainees")
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
