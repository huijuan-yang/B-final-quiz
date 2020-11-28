package com.thoughtworks.capability.gtb.entrancequiz.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class Trainee {
    private Integer id;
    private String name;
}
