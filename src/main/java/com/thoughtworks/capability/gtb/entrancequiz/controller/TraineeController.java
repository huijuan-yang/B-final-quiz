package com.thoughtworks.capability.gtb.entrancequiz.controller;

import com.thoughtworks.capability.gtb.entrancequiz.model.Trainee;
import com.thoughtworks.capability.gtb.entrancequiz.service.TraineeService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;
import java.util.List;


@RestController
@CrossOrigin(origins = "*")
public class TraineeController {

    private final TraineeService traineeService;

    public TraineeController(TraineeService traineeService) {
        this.traineeService = traineeService;
    }

    @GetMapping("/trainees")
    @ResponseStatus(HttpStatus.OK)
    public List<Trainee> getAllTrainees() {
        return traineeService.getAllTrainees();
    }

//    @PostMapping("/trainees")
//    @ResponseStatus(HttpStatus.CREATED)
//    public Trainee addTrainee(@RequestBody @NotNull(message = "name cannot be null") String name) {
//        return traineeService.addTrainee(name);
//    }
}
