package com.github.nguyentrucxinh.dto;

import com.fasterxml.jackson.annotation.JsonView;
import com.github.nguyentrucxinh.helper.constant.MySQLConstant;
import com.github.nguyentrucxinh.helper.util.Views;
import lombok.Data;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.Max;

@Data
public class HotelDto extends BaseDto {

    @JsonView(Views.Public.class)
    @Max(MySQLConstant.BIGINT_MAX)
    private Long id;

    @JsonView(Views.Public.class)
    @Length(max = MySQLConstant.VARCHAR_MAX)
    @NotBlank(groups = {HotelDto.validateOnCreate.class, HotelDto.validateOnUpdate.class})
    private String name;

    @JsonView(Views.Internal.class)
    private Integer classification;

    @JsonView(Views.Internal.class)
    private boolean open;

}

