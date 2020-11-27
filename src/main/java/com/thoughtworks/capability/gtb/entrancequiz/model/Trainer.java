package com.thoughtworks.capability.gtb.entrancequiz.model;

public class Trainer {
    private final Integer id;
    private final String name;

    public Trainer(Integer id, String name) {
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
