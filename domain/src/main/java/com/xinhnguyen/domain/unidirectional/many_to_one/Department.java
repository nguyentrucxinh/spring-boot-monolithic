package com.xinhnguyen.domain.unidirectional.many_to_one;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Unidirectional
 * Single Valued Mappings
 * Demo @ManyToOne
 */
@Entity
public class Department implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String name;

    public Department() {
    }

    public Department(String name) {
        this.name = name;
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
}
