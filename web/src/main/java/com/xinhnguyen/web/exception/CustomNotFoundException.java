package com.xinhnguyen.web.exception;

public class CustomNotFoundException extends RuntimeException {

    public CustomNotFoundException(String msg) {
        super(msg);
    }
}
