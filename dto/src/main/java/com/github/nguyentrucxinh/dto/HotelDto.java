package com.github.nguyentrucxinh.dto;

import com.fasterxml.jackson.annotation.JsonView;
import com.github.nguyentrucxinh.helper.constant.MySQLConstant;
import com.github.nguyentrucxinh.helper.util.Views;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.Max;

@Getter
@Setter
@NoArgsConstructor
public class HotelDto extends BaseDto {

    @JsonView(Views.Public.class)
    @Length(max = MySQLConstant.VARCHAR_MAX)
    @NotBlank(groups = {HotelDto.validateOnCreate.class, HotelDto.validateOnUpdate.class})
    private String name;

    @JsonView(Views.Internal.class)
    private Integer classification;

    @JsonView(Views.Internal.class)
    private boolean open;

}

