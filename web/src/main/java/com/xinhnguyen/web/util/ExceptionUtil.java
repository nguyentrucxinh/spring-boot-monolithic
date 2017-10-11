package com.xinhnguyen.web.util;

import com.xinhnguyen.web.bean.ErrorMsg;
import org.springframework.validation.BindingResult;

import javax.validation.ConstraintViolationException;
import java.util.ArrayList;
import java.util.List;

/**
 * Defines all behaviors support for catch Exception
 *
 * @author Xinh Nguyen
 */
public class ExceptionUtil {

    private ExceptionUtil() {
    }

    /**
     * Convert {@link BindingResult} to {@link List<ErrorMsg>}
     *
     * @param bindingResult an exception
     * @return the {@link List<ErrorMsg>}
     */
    public static List<ErrorMsg> convertBindingResultToListErrorMsg(
            BindingResult bindingResult) {
        List<ErrorMsg> errorMessages = new ArrayList<>();
        bindingResult.getFieldErrors().forEach(fieldError ->
                errorMessages.add(new ErrorMsg(fieldError.getField(), fieldError.getDefaultMessage()))
        );
        return errorMessages;
    }

    /**
     * Convert {@link ConstraintViolationException} to {@link List<ErrorMsg>}
     *
     * @param ex an exception
     * @return the {@link List<ErrorMsg>}
     */
    public static List<ErrorMsg> convertConstraintViolationExceptionToListErrorMessage(
            ConstraintViolationException ex) {
        List<ErrorMsg> errorMessages = new ArrayList<>();
        ex.getConstraintViolations().forEach(constraintViolation -> errorMessages.add(new ErrorMsg("", constraintViolation.getMessage())));
        return errorMessages;
    }
}
