package com.mariufa.groupservice.models;

public class Group {

    private final long id;
    private final String groupKey;

    public Group(long id, String groupKey) {
        this.id = id;
        this.groupKey = groupKey;
    }

    public long getId() {
        return id;
    }

    public String getGroupKey() {
        return groupKey;
    }
}
