package com.thoughtworks.capability.gtb.entrancequiz.model;

public class Trainee {
    private final Integer id;
    private final String name;

    public Trainee(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
