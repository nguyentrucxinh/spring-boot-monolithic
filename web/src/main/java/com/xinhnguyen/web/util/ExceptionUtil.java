package com.xinhnguyen.web.util;

import com.xinhnguyen.web.bean.ErrorMsg;
import org.springframework.validation.BindingResult;

import java.util.ArrayList;
import java.util.List;

public class ExceptionUtil {

    private ExceptionUtil() {
    }

    /**
     * Convert error DTO to list error
     *
     * @param bindingResult error DTO
     * @return list error
     */
    public static List<ErrorMsg> convertBindingResultToListErrorMessage(
            BindingResult bindingResult) {
        List<ErrorMsg> errorMessages = new ArrayList<>();
        bindingResult.getFieldErrors().forEach(fieldError ->
                errorMessages.add(new ErrorMsg(fieldError.getField(), fieldError.getDefaultMessage()))
        );
        return errorMessages;
    }
}
