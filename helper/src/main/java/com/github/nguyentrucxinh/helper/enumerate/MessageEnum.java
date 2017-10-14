package com.github.nguyentrucxinh.helper.enumerate;

public enum MessageEnum {

    EXIST("Existed"),

    NOT_EXIST("Does not exist"),

    ALREADY_DELETED("Already deleted");

    private final String message;

    MessageEnum(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}

