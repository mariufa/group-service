package com.mariufa.groupservice.models;

import java.util.List;

public class User {

    private final long id;
    private final String username;
    private List<Group> groups;

    public User(long id, String username, List<Group> groups) {
        this.id = id;
        this.username = username;
        this.groups = groups;
    }

    public long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public List<Group> getGroups() {
        return groups;
    }
}
