package com.xinhnguyen.helper.response;

public class SuccessDetail<T> {

    private int status_code;
    private String message;
    private T data;

    public SuccessDetail() {
    }

    public SuccessDetail(int status_code, String message, T data) {
        this.status_code = status_code;
        this.message = message;
        this.data = data;
    }

    public int getStatus_code() {
        return status_code;
    }

    public void setStatus_code(int status_code) {
        this.status_code = status_code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
