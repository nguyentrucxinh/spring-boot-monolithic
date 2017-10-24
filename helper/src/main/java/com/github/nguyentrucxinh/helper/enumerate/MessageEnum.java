package com.github.nguyentrucxinh.helper.enumerate;

public enum MessageEnum {

    EXIST("Existed"),

    NOT_EXIST("Does not exist"),

    ALREADY_DELETED("Already deleted"),

    NOT_NULL("May be not null");

    private final String message;

    MessageEnum(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}

