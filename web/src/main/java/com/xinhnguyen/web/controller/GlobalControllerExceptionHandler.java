package com.xinhnguyen.web.controller;

import com.xinhnguyen.web.bean.ResponseMsg;
import com.xinhnguyen.web.exception.CustomNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.NoHandlerFoundException;

import javax.validation.ConstraintViolationException;

@RestControllerAdvice
public class GlobalControllerExceptionHandler {

    // TODO: Add Logger SL4J
//    private static final Logger LOG = Logger.getLogger(GlobalControllerExceptionHandler.class);

    @ExceptionHandler(value = {ConstraintViolationException.class})
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ResponseMsg constraintViolationException(ConstraintViolationException ex) {
//        LOG.error(ex.getCause().toString());
        return new ResponseMsg(400, "Bad Request");
    }

    @ExceptionHandler(value = {NoHandlerFoundException.class})
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ResponseMsg noHandlerFoundException(Exception ex) {
//        LOG.error(ex.getCause().toString());
        return new ResponseMsg(404, "Resource Not Found");
    }

    @ExceptionHandler(value = {Exception.class})
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ResponseMsg unknownException(Exception ex) {
//        LOG.error(ex.getCause().toString());
        return new ResponseMsg(500, "Internal Server Error");
    }

    @ExceptionHandler(CustomNotFoundException.class)
    public ResponseMsg handleNotFoundException(CustomNotFoundException ex) {
        return new ResponseMsg(404, ex.getMessage());
    }
}
