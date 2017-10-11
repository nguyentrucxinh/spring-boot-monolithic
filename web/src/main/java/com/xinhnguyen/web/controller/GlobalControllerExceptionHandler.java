package com.xinhnguyen.web.controller;

import com.xinhnguyen.web.bean.ErrorMsg;
import com.xinhnguyen.web.bean.ResponseMsg;
import com.xinhnguyen.web.exception.CustomNotFoundException;
import com.xinhnguyen.web.exception.DTOInControllerNotValidException;
import com.xinhnguyen.web.exception.DTOInServiceNotValidException;
import com.xinhnguyen.web.util.ExceptionUtil;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.NoHandlerFoundException;

import javax.validation.ConstraintViolationException;
import java.util.List;

@RestControllerAdvice
public class GlobalControllerExceptionHandler {

    // TODO: Add Logger SL4J
//    private static final Logger LOG = Logger.getLogger(GlobalControllerExceptionHandler.class);

    @ExceptionHandler(value = {ConstraintViolationException.class})
    public ResponseEntity<ResponseMsg<String>> handleConstraintViolationException(ConstraintViolationException ex) {
        return new ResponseEntity<>(new ResponseMsg<String>(HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), ""), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(value = {MethodArgumentNotValidException.class})
    public ResponseEntity<ResponseMsg<String>> handleMethodArgumentNotValidException(MethodArgumentNotValidException ex) {
        return new ResponseEntity<>(new ResponseMsg<String>(HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), ""), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(value = {NullPointerException.class})
    public ResponseEntity<ResponseMsg<String>> handleNullPointerException(NullPointerException ex) {
        return new ResponseEntity<>(new ResponseMsg<String>(HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), ""), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(value = {NoHandlerFoundException.class})
    public ResponseEntity<ResponseMsg<String>> handleNoHandlerFoundException(NoHandlerFoundException ex) {
        return new ResponseEntity<>(new ResponseMsg<String>(HttpStatus.NOT_FOUND.value(), HttpStatus.NOT_FOUND.getReasonPhrase(), ""), HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(value = {Exception.class})
    public ResponseEntity<ResponseMsg<String>> handleException(Exception ex) {
        return new ResponseEntity<>(new ResponseMsg<String>(HttpStatus.INTERNAL_SERVER_ERROR.value(), HttpStatus.INTERNAL_SERVER_ERROR.getReasonPhrase(), ""), HttpStatus.INTERNAL_SERVER_ERROR);
    }

    /**
     * CustomNotFoundException
     *
     * @param ex an exception
     * @return ResponseEntity
     */
    @ExceptionHandler(value = {CustomNotFoundException.class})
    public ResponseEntity<ResponseMsg<String>> handleCustomNotFoundException(CustomNotFoundException ex) {
        return new ResponseEntity<>(new ResponseMsg<String>(HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), ""), HttpStatus.BAD_REQUEST);
    }

    /**
     * DTO Not Valid
     *
     * @param ex an exception
     * @return List ErrorMsg & HttpStatus
     */
    @ExceptionHandler(value = {DTOInControllerNotValidException.class})
    public ResponseEntity<List<ErrorMsg>> handleDTOBindingResultNotValidException(DTOInControllerNotValidException ex) {
        return new ResponseEntity<>(ExceptionUtil.convertBindingResultToListErrorMessage(ex.getBindingResult()), HttpStatus.BAD_REQUEST);
    }

    /**
     * DTO Not Valid
     *
     * @param ex an exception
     * @return List ErrorMsg & HttpStatus
     */
    @ExceptionHandler(value = DTOInServiceNotValidException.class)
    public ResponseEntity<List<ErrorMsg>> handleDTOErrorMessageNotValidException(DTOInServiceNotValidException ex) {
        return new ResponseEntity<>(ex.getErrorMsgs(), HttpStatus.BAD_REQUEST);
    }
}
