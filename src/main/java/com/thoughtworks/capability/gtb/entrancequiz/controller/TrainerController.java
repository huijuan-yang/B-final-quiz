package com.thoughtworks.capability.gtb.entrancequiz.controller;

import com.thoughtworks.capability.gtb.entrancequiz.model.Trainer;
import com.thoughtworks.capability.gtb.entrancequiz.service.TrainerService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class TrainerController {
    private final TrainerService trainerService;

    public TrainerController(TrainerService trainerService) {
        this.trainerService = trainerService;
    }

    @GetMapping("/grouped-trainers")
    @ResponseStatus(HttpStatus.OK)
    public List<Trainer> getAllGroupedTrainers() { return trainerService.getAllGroupedTrainers(); }

    @GetMapping("/ungrouped-trainers")
    @ResponseStatus(HttpStatus.OK)
    public List<Trainer> getAllUngroupedTrainers() { return trainerService.getAllUngroupedTrainers(); }

    @PostMapping("/trainers")
    @ResponseStatus(HttpStatus.CREATED)
    public void addTrainer(@RequestBody String name) {
        trainerService.addTrainer(name);
    }

}
