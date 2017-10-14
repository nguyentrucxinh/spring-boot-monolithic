package com.github.nguyentrucxinh.helper.exception;

import com.github.nguyentrucxinh.helper.response.ExceptionDetailMessage;

import java.util.List;

@SuppressWarnings("serial")
public class DTOInServiceNotValidException extends RuntimeException {

    private final List<ExceptionDetailMessage> errorMsgs;

    /**
     * Constructor for {@link DTOInServiceNotValidException}.
     *
     * @param errorMsgs the results of the validation
     */
    public DTOInServiceNotValidException(List<ExceptionDetailMessage> errorMsgs) {
        this.errorMsgs = errorMsgs;
    }

    /**
     * Return the results of the failed validation.
     */
    public List<ExceptionDetailMessage> getErrorMsgs() {
        return errorMsgs;
    }
}