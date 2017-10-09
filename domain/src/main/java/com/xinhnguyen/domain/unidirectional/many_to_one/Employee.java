package com.xinhnguyen.domain.unidirectional.many_to_one;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Unidirectional
 * Single Valued Mappings
 * Demo @ManyToOne
 */
@Entity
public class Employee implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String name;

    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;

    public Employee() {
    }

    public Employee(String name, Department department) {
        this.name = name;
        this.department = department;
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

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
