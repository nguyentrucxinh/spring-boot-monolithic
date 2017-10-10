package com.xinhnguyen.web.exception;

import com.xinhnguyen.web.bean.ErrorMsg;

import java.util.List;

@SuppressWarnings("serial")
public class DTOErrorMessageNotValidException extends RuntimeException {

    private final List<ErrorMsg> errorMsgs;

    /**
     * Constructor for {@link DTOErrorMessageNotValidException}.
     *
     * @param errorMsgs the results of the validation
     */
    public DTOErrorMessageNotValidException(List<ErrorMsg> errorMsgs) {
        this.errorMsgs = errorMsgs;
    }

    /**
     * Return the results of the failed validation.
     */
    public List<ErrorMsg> getErrorMsgs() {
        return errorMsgs;
    }
}