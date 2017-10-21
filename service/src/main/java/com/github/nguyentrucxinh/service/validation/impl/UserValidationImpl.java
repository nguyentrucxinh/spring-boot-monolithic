package com.github.nguyentrucxinh.service.validation.impl;

import com.github.nguyentrucxinh.helper.enumerate.MessageEnum;
import com.github.nguyentrucxinh.helper.response.ExceptionDetailMessage;
import com.github.nguyentrucxinh.repository.UserRepository;
import com.github.nguyentrucxinh.service.validation.UserValidation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserValidationImpl implements UserValidation {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<ExceptionDetailMessage> isValidateUserId(Long id) {
        List<ExceptionDetailMessage> exceptionDetailMessages = new ArrayList<>();
        if (!userRepository.exists(id)) {
            exceptionDetailMessages.add(new ExceptionDetailMessage("user_id", MessageEnum.NOT_EXIST.getMessage()));
        }
        return exceptionDetailMessages;
    }
}
