package com.xinhnguyen.domain.unidirectional.one_to_many;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Unidirectional
 * Collection Valued Mappings
 * Demo @OneToMany
 */
@Entity
public class BookMark implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String name;

    public BookMark() {
    }

    public BookMark(String name) {
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
