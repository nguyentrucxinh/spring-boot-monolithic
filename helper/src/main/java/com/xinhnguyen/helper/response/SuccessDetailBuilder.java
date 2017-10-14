package com.xinhnguyen.helper.response;

import org.springframework.http.HttpStatus;
import org.springframework.web.context.request.ServletWebRequest;
import org.springframework.web.context.request.WebRequest;

import javax.servlet.http.HttpServletRequest;

/**
 * A builder for SuccessDetail objects. This class facilitates the construction and population of SuccessDetail
 * objects and from REST service request data.
 *
 * @author Xinh Nguyen
 */
public class SuccessDetailBuilder<T> {

    /**
     * The SuccessDetail object under construction.
     */
    private final transient SuccessDetail<T> successDetail;

    /**
     * Constructs a new SuccessDetailBuilder.
     */
    public SuccessDetailBuilder() {
        successDetail = new SuccessDetail<>();
    }

    /**
     * Invoke this method to obtain the SuccessDetail object after using builder methods to populate it.
     *
     * @return An SuccessDetail object.
     */
    public SuccessDetail build() {
        return successDetail;
    }

    /**
     * Populate the SuccessDetail attributes with information. Returns this SuccessDetailBuilder
     * to chain method invocations.
     *
     * @param data An data.
     * @return This SuccessDetailBuilder object.
     */
    public SuccessDetailBuilder data(final T data) {
        if (data != null) {
            successDetail.setData(data);
        }
        return this;
    }

    /**
     * Populate the SuccessDetail attributes with information from a HttpStatus. Returns this SuccessDetailBuilder
     * to chain method invocations.
     *
     * @param status A HttpStatus.
     * @return This SuccessDetailBuilder object.
     */
    public SuccessDetailBuilder httpStatus(final HttpStatus status) {
        if (status != null) {
            successDetail.setStatus(status.value());
            successDetail.setStatusText(status.getReasonPhrase());
        }
        return this;
    }

    /**
     * Populate the SuccessDetail attributes with information from a WebRequest. Typically use either a WebRequest or
     * HttpServletRequest, but not both. Returns this SuccessDetailBuilder to chain method invocations.
     *
     * @param request A WebRequest.
     * @return This SuccessDetailBuilder object.
     */
    public SuccessDetailBuilder webRequest(final WebRequest request) {
        if (request instanceof ServletWebRequest) {
            final HttpServletRequest httpRequest = ((ServletWebRequest) request)
                    .getNativeRequest(HttpServletRequest.class);
            return httpServletRequest(httpRequest);
        }
        return this;
    }

    /**
     * Populate the SuccessDetail attributes with information from a HttpServletRequest. Typically use either a
     * WebRequest or HttpServletRequest, but not both. Returns this SuccessDetailBuilder to chain method invocations.
     *
     * @param request A HttpServletRequest.
     * @return This SuccessDetailBuilder object.
     */
    public SuccessDetailBuilder httpServletRequest(final HttpServletRequest request) {
        if (request != null) {
            successDetail.setMethod(request.getMethod());
            successDetail.setPath(request.getServletPath());
        }
        return this;
    }

}

