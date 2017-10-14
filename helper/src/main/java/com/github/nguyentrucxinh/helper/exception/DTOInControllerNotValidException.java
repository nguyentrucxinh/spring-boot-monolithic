package com.github.nguyentrucxinh.helper.exception;

import org.springframework.validation.BindingResult;

@SuppressWarnings("serial")
public class DTOInControllerNotValidException extends RuntimeException {

    private final BindingResult bindingResult;

    /**
     * Constructor for {@link DTOInControllerNotValidException}.
     *
     * @param bindingResult the results of the validation
     */
    public DTOInControllerNotValidException(BindingResult bindingResult) {
        this.bindingResult = bindingResult;
    }

    /**
     * Return the results of the failed validation.
     */
    public BindingResult getBindingResult() {
        return this.bindingResult;
    }

}

