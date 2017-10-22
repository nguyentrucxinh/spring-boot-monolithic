package com.github.nguyentrucxinh.dto;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

public class HotelDto extends BaseDto implements Serializable {

    private Long id;

    @NotNull(groups = {HotelDto.validateOnCreate.class, HotelDto.validateOnUpdate.class})
    private String name;

    private Integer classification;

    private boolean open;

    public HotelDto() {
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
}

