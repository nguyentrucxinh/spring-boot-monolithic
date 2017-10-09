package com.xinhnguyen.domain.unidirectional.one_to_one;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Unidirectional
 * Single Valued Mappings
 * Demo @OneToOne
 */
@Entity
public class Person implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String name;

    @OneToOne
    @JoinColumn(name = "job_id")
    private Job job;

    public Person() {
    }

    public Person(String name, Job job) {
        this.name = name;
        this.job = job;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }
}
