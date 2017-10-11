package com.xinhnguyen.web.exception;

import com.xinhnguyen.web.bean.ErrorMsg;

import java.util.List;

@SuppressWarnings("serial")
public class DTOInServiceNotValidException extends RuntimeException {

    private final List<ErrorMsg> errorMsgs;

    /**
     * Constructor for {@link DTOInServiceNotValidException}.
     *
     * @param errorMsgs the results of the validation
     */
    public DTOInServiceNotValidException(List<ErrorMsg> errorMsgs) {
        this.errorMsgs = errorMsgs;
    }

    /**
     * Return the results of the failed validation.
     */
    public List<ErrorMsg> getErrorMsgs() {
        return errorMsgs;
    }
}