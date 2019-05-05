package com.mariufa.groupservice.models;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "Groups")
public class Group {

    @Id
    @GeneratedValue(generator = "group_generator")
    @SequenceGenerator(
            name = "group_generator",
            sequenceName = "group_sequence",
            initialValue = 1000
    )
    private Long id;

    @NotBlank
    @Column(columnDefinition = "text")
    private String groupKey;

    public Long getId() {
        return id;
    }

    public String getGroupKey() {
        return groupKey;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setGroupKey(String groupKey) {
        this.groupKey = groupKey;
    }
}
