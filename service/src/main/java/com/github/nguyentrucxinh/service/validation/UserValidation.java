package com.github.nguyentrucxinh.service.validation;

import com.github.nguyentrucxinh.helper.response.ExceptionDetailMessage;

import java.util.List;

public interface UserValidation {

    List<ExceptionDetailMessage> isValidateUserId(Long id);
}
