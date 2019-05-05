package com.mariufa.groupservice.controllers;

import com.mariufa.groupservice.models.Group;
import com.mariufa.groupservice.repository.GroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<Object> createGroup(@Valid @RequestBody Group group) {
        if (groupRepository.findByGroupKey(group.getGroupKey()).size() > 0) {
            return ResponseEntity.status(409).build();
        } else {
            groupRepository.save(group);
            return ResponseEntity.ok().build();
        }
    }

    @GetMapping("/searchbykey")
    public  List<Group> getByGroupKey(@RequestParam String groupKey) {
        return groupRepository.findByGroupKey(groupKey);
    }
}
