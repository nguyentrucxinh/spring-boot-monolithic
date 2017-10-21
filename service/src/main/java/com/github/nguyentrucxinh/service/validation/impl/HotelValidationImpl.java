package com.github.nguyentrucxinh.service.validation.impl;

import com.github.nguyentrucxinh.helper.enumerate.MessageEnum;
import com.github.nguyentrucxinh.helper.response.ExceptionDetailMessage;
import com.github.nguyentrucxinh.repository.HotelRepository;
import com.github.nguyentrucxinh.service.validation.HotelValidation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class HotelValidationImpl implements HotelValidation {

    @Autowired
    private HotelRepository hotelRepository;

    @Override
    public List<ExceptionDetailMessage> isValidateHotelId(Long id) {
        List<ExceptionDetailMessage> exceptionDetailMessages = new ArrayList<>();
        if (!hotelRepository.exists(id)) {
            exceptionDetailMessages.add(new ExceptionDetailMessage("hotel_id", MessageEnum.NOT_EXIST.getMessage()));
        }
        return exceptionDetailMessages;
    }
}
