package com.mariufa.groupservice.repository;

import com.mariufa.groupservice.models.Group;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GroupRepository extends JpaRepository<Group, Long> {
}
