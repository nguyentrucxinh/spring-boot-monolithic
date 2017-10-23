package com.github.nguyentrucxinh.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
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
public class UserDto extends BaseDto {

    @JsonView(Views.Public.class)
    @Max(MySQLConstant.BIGINT_MAX)
    private Long id;

    @JsonView(Views.Public.class)
    @Length(max = MySQLConstant.VARCHAR_MAX)
    @NotBlank(groups = {UserDto.validateOnCreate.class, UserDto.validateOnUpdate.class})
    private String username;

    @JsonView(Views.Internal.class)
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @Length(max = MySQLConstant.VARCHAR_MAX)
    @NotBlank(groups = UserDto.validateOnCreate.class)
    private String password;

    @JsonView(Views.Internal.class)
    private String passwordSalt;

    @JsonView(Views.Public.class)
    @Length(max = MySQLConstant.VARCHAR_MAX)
    @NotBlank(groups = {UserDto.validateOnCreate.class, UserDto.validateOnUpdate.class})
    private String firstName;

    @JsonView(Views.Public.class)
    @Length(max = MySQLConstant.VARCHAR_MAX)
    @NotBlank(groups = {UserDto.validateOnCreate.class, UserDto.validateOnUpdate.class})
    private String lastName;

}
