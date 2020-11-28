package com.thoughtworks.capability.gtb.entrancequiz.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Group {

    private Integer groupId;
    private String groupName;
    private List<Trainer> groupTrainers;
    private List<Trainee> groupTrainees;
}
