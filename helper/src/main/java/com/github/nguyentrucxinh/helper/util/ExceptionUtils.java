package com.github.nguyentrucxinh.helper.util;

import com.github.nguyentrucxinh.helper.response.ExceptionDetailMessage;
import org.springframework.validation.BindingResult;

import javax.validation.ConstraintViolationException;
import java.util.ArrayList;
import java.util.List;

/**
 * Defines all behaviors support for catch Exception
 *
 * @author Xinh Nguyen
 */
public class ExceptionUtils {

    private ExceptionUtils() {
    }

    /**
     * Convert {@link BindingResult} to list {@link ExceptionDetailMessage}
     *
     * @param bindingResult an exception
     * @return the list {@link ExceptionDetailMessage}
     */
    public static List<ExceptionDetailMessage> convertBindingResultToListErrorMsg(
            BindingResult bindingResult) {
        List<ExceptionDetailMessage> errorMessages = new ArrayList<>();
        bindingResult.getFieldErrors().forEach(fieldError ->
                errorMessages.add(new ExceptionDetailMessage(fieldError.getField(), fieldError.getDefaultMessage()))
        );
        return errorMessages;
    }

    /**
     * Convert {@link ConstraintViolationException} to list {@link ExceptionDetailMessage}
     *
     * @param ex an exception
     * @return the list {@link ExceptionDetailMessage}
     */
    public static List<ExceptionDetailMessage> convertConstraintViolationExceptionToListErrorMsg(
            ConstraintViolationException ex) {
        List<ExceptionDetailMessage> errorMessages = new ArrayList<>();
        ex.getConstraintViolations().forEach(constraintViolation -> errorMessages.add(new ExceptionDetailMessage("", constraintViolation.getMessage())));
        return errorMessages;
    }

    /**
     * Convert to list {@link ExceptionDetailMessage}
     *
     * @param name    an exception
     * @param message an exception
     * @return the list {@link ExceptionDetailMessage}
     */
    public static List<ExceptionDetailMessage> convertToListErrorMessage(String name, String message) {
        List<ExceptionDetailMessage> errorMessages = new ArrayList<>();
        errorMessages.add(new ExceptionDetailMessage(name, message));
        return errorMessages;
    }
}
