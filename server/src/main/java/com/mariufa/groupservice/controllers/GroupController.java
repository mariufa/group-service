package com.mariufa.groupservice.controllers;

import com.mariufa.groupservice.models.Group;
import com.mariufa.groupservice.repository.GroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class GroupController {

    @Autowired
    private GroupRepository groupRepository;

    @GetMapping("/groups")
    public List<Group> getGroups() {
        return groupRepository.findAll();
    }

    @PostMapping("/groups")
    public Group createGroup(@Valid @RequestBody Group group) {
        return groupRepository.save(group);
    }

    @GetMapping("/searchbykey")
    public  List<Group> getByGroupKey(@RequestParam String groupKey) {
        return groupRepository.findByGroupKey(groupKey);
    }
}
