package com.github.nguyentrucxinh.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonView;
import com.github.nguyentrucxinh.helper.constant.MySQLConstant;
import com.github.nguyentrucxinh.helper.util.Views;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.Max;

public class UserDTO extends BaseDTO {

    @JsonView(Views.Public.class)
    @Max(MySQLConstant.BIGINT_MAX)
    private Long id;

    @JsonView(Views.Public.class)
    @Length(max = MySQLConstant.VARCHAR_MAX)
    @NotBlank(groups = {UserDTO.validateOnCreate.class, UserDTO.validateOnUpdate.class})
    private String username;

    @JsonView(Views.Internal.class)
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @Length(max = MySQLConstant.VARCHAR_MAX)
    @NotBlank(groups = UserDTO.validateOnCreate.class)
    private String password;

    @JsonView(Views.Internal.class)
    private String passwordSalt;

    @JsonView(Views.Public.class)
    @Length(max = MySQLConstant.VARCHAR_MAX)
    @NotBlank(groups = {UserDTO.validateOnCreate.class, UserDTO.validateOnUpdate.class})
    private String firstName;

    @JsonView(Views.Public.class)
    @Length(max = MySQLConstant.VARCHAR_MAX)
    @NotBlank(groups = {UserDTO.validateOnCreate.class, UserDTO.validateOnUpdate.class})
    private String lastName;
}
