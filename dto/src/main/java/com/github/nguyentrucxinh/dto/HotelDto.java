package com.github.nguyentrucxinh.dto;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class HotelDto extends BaseDto {

    private Long id;

    @NotNull(groups = {HotelDto.validateOnCreate.class, HotelDto.validateOnUpdate.class})
    private String name;

    private Integer classification;

    private boolean open;

}

