package com.github.nguyentrucxinh.helper.response;

public class SuccessDetail<T> {

    /**
     * A timestamp expressed in milliseconds.
     */
    private long timestamp;
    /**
     * The HTTP method (e.g. GET, POST, etc.)
     */
    private String method = "";
    /**
     * The web service servlet path.
     */
    private String path = "";
    /**
     * The HTTP status code of the response.
     */
    private int status;
    /**
     * The text description of the HTTP status code of the response.
     */
    private String statusText = "";
    /**
     * The value of the Exception message attribute.
     */
    private T data;

    /**
     * Construct an ExceptionDetail.
     */
    public SuccessDetail() {
        this.timestamp = System.currentTimeMillis();
    }

    /**
     * Returns the timestamp attribute value.
     *
     * @return A long.
     */
    public long getTimestamp() {
        return timestamp;
    }

    /**
     * Sets the timestamp attribute value.
     *
     * @param timestamp A long.
     */
    public void setTimestamp(final long timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * Returns the method attribute value.
     *
     * @return A String.
     */
    public String getMethod() {
        return method;
    }

    /**
     * Sets the method attribute value.
     *
     * @param method A String.
     */
    public void setMethod(final String method) {
        this.method = method;
    }

    /**
     * Returns the path attribute value.
     *
     * @return A String.
     */
    public String getPath() {
        return path;
    }

    /**
     * Sets the path attribute value.
     *
     * @param path A String.
     */
    public void setPath(final String path) {
        this.path = path;
    }

    /**
     * Returns the status attribute value.
     *
     * @return An int.
     */
    public int getStatus() {
        return status;
    }

    /**
     * Sets the status attribute value.
     *
     * @param status An int.
     */
    public void setStatus(final int status) {
        this.status = status;
    }

    /**
     * Returns the statusText attribute value.
     *
     * @return A String.
     */
    public String getStatusText() {
        return statusText;
    }

    /**
     * Sets the statusText attribute value.
     *
     * @param statusText A String.
     */
    public void setStatusText(final String statusText) {
        this.statusText = statusText;
    }

    /**
     * Returns the data value.
     *
     * @return A ${@link T}.
     */
    public T getData() {
        return data;
    }

    /**
     * Sets the data value.
     *
     * @param data A ${@link T}.
     */
    public void setData(final T data) {
        this.data = data;
    }
}
