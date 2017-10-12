package com.xinhnguyen.web.enumerate;

public enum ENotValidMsg {

    EXIST("Existed"),

    NOT_EXIST("Does not exist"),

    ALREADY_DELETED("Already deleted");

    private final String message;

    ENotValidMsg(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}

