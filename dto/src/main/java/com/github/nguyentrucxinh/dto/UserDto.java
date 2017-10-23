package com.github.nguyentrucxinh.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.nguyentrucxinh.helper.constant.MySQLConstant;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

@Getter
@Setter
@NoArgsConstructor
public class UserDto extends BaseDto {

    @Length(max = MySQLConstant.VARCHAR_MAX)
    @NotBlank(groups = {UserDto.validateOnCreate.class, UserDto.validateOnUpdate.class})
    private String username;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @Length(max = MySQLConstant.VARCHAR_MAX)
    @NotBlank(groups = UserDto.validateOnCreate.class)
    private String password;

    private String passwordSalt;

    @Length(max = MySQLConstant.VARCHAR_MAX)
    @NotBlank(groups = {UserDto.validateOnCreate.class, UserDto.validateOnUpdate.class})
    private String firstName;

    @Length(max = MySQLConstant.VARCHAR_MAX)
    @NotBlank(groups = {UserDto.validateOnCreate.class, UserDto.validateOnUpdate.class})
    private String lastName;

}
