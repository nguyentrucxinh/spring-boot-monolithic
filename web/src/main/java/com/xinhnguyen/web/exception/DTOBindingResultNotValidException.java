package com.xinhnguyen.web.exception;

import org.springframework.validation.BindingResult;

@SuppressWarnings("serial")
public class DTOBindingResultNotValidException extends RuntimeException {

    private final BindingResult bindingResult;

    /**
     * Constructor for {@link DTOBindingResultNotValidException}.
     *
     * @param bindingResult the results of the validation
     */
    public DTOBindingResultNotValidException(BindingResult bindingResult) {
        this.bindingResult = bindingResult;
    }

    /**
     * Return the results of the failed validation.
     */
    public BindingResult getBindingResult() {
        return this.bindingResult;
    }

}

