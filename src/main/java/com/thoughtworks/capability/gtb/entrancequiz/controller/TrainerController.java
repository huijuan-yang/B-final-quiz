package com.thoughtworks.capability.gtb.entrancequiz.controller;

import com.thoughtworks.capability.gtb.entrancequiz.model.Trainer;
import com.thoughtworks.capability.gtb.entrancequiz.service.TrainerService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class TrainerController {
    private final TrainerService trainerService;

    public TrainerController(TrainerService trainerService) {
        this.trainerService = trainerService;
    }

    @GetMapping("/trainers")
    public List<Trainer> getAllTrainers() {
        return trainerService.getAllTrainers();
    }

}
