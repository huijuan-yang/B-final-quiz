package com.thoughtworks.capability.gtb.entrancequiz.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Trainer {
    private Integer id;
    private String name;
    private Boolean grouped;
}
