package com.github.nguyentrucxinh.domain;

import com.fasterxml.jackson.annotation.JsonView;
import com.github.nguyentrucxinh.helper.util.Views;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Entity
public class Hotel implements Serializable {

    @JsonView(Views.Public.class)
    @Id
    @GeneratedValue
    private Long id;

    @JsonView(Views.Public.class)
    @Column(unique = true)
    @NotNull
    private String name;

    @JsonView(Views.Internal.class)
    @Column
    private Integer classification;

    @JsonView(Views.Internal.class)
    @Column
    private boolean open;

    public Hotel() {
    }

    public Hotel(String name, int classification, boolean open) {
        this.name = name;
        this.classification = classification;
        this.open = open;
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

    public Integer getClassification() {
        return classification;
    }

    public void setClassification(Integer classification) {
        this.classification = classification;
    }

    public boolean isOpen() {
        return open;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }

    // Use for password
    // @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
}
