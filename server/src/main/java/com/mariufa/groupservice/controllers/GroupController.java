package com.mariufa.groupservice.controllers;

import com.mariufa.groupservice.models.Group;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GroupController {

    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/test")
    public Group outputAGroup() {
        return new Group(counter.incrementAndGet(), "test");
    }
}
