package com.xinhnguyen.web.bean;

public class ErrorMsg {

    private String field;
    private String message;

    public ErrorMsg() {
    }

    public ErrorMsg(String field, String message) {
        this.field = field;
        this.message = message;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}