package com.xinhnguyen.dto;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

public class HotelDTO extends BaseDTO implements Serializable {

    private Long id;

    @NotNull(groups = {HotelDTO.validateOnCreate.class, HotelDTO.validateOnUpdate.class})
    private String name;

    private Integer classification;

    private Boolean isOpen;

    public HotelDTO() {
    }

    public HotelDTO(String name, Integer classification, Boolean isOpen) {
        this.name = name;
        this.classification = classification;
        this.isOpen = isOpen;
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

    public Boolean getOpen() {
        return isOpen;
    }

    public void setOpen(Boolean open) {
        isOpen = open;
    }
}

