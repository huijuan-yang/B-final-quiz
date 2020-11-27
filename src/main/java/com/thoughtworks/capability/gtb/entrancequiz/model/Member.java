package com.thoughtworks.capability.gtb.entrancequiz.model;

public class Member {
    private final Integer id;
    private final String name;

    public Member(Integer id, String name) {
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
