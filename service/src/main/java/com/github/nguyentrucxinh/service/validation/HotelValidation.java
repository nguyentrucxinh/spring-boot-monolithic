package com.github.nguyentrucxinh.service.validation;

import com.github.nguyentrucxinh.helper.response.ExceptionDetailMessage;

import java.util.List;

public interface HotelValidation {

    /**
     * Check exist a hotel
     *
     * @param id the primary key of {@link com.github.nguyentrucxinh.domain.Hotel}
     * @return the list {@link ExceptionDetailMessage}
     */
    List<ExceptionDetailMessage> isValidateHotelId(Long id);
}
