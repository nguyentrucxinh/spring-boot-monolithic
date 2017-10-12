package com.xinhnguyen.web.api;

import com.xinhnguyen.helper.bean.ErrorMsg;
import com.xinhnguyen.helper.bean.ExceptionDetail;
import com.xinhnguyen.helper.bean.ExceptionDetailBuilder;
import com.xinhnguyen.helper.bean.ResponseMsg;
import com.xinhnguyen.helper.exception.CustomNotFoundException;
import com.xinhnguyen.helper.exception.DTOInControllerNotValidException;
import com.xinhnguyen.helper.exception.DTOInServiceNotValidException;
import com.xinhnguyen.helper.util.ExceptionUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.NoHandlerFoundException;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import javax.persistence.NoResultException;
import javax.validation.ConstraintViolationException;
import java.util.List;

/**
 * Controller for global/generic exception handling
 *
 * @author Xinh Nguyen
 */
@RestControllerAdvice
public class GlobalControllerExceptionHandler extends ResponseEntityExceptionHandler {

    private static final Logger logger = LoggerFactory.getLogger(GlobalControllerExceptionHandler.class);

    /**
     * Handles JPA NoResultExceptions thrown from web service controller methods. Creates a response with an empty body
     * and HTTP status code 404, not found.
     *
     * @param ex A NoResultException instance.
     * @return A ResponseEntity with an empty response body and HTTP status code 404.
     */
    @ExceptionHandler(NoResultException.class)
    public ResponseEntity<Object> handleNoResultException(final NoResultException ex, final WebRequest request) {
        logger.info("> handleNoResultException");
        logger.info("- NoResultException: ", ex);
        final ExceptionDetail detail = new ExceptionDetailBuilder().exception(ex).httpStatus(HttpStatus.NOT_FOUND)
                .webRequest(request).build();
        logger.info("< handleNoResultException");
        return handleExceptionInternal(ex, detail, new HttpHeaders(), HttpStatus.NOT_FOUND, request);
    }

    /**
     * Handles EmptyResultDataAccessException thrown from web service controller methods. Creates a response with an
     * empty body and HTTP status code 404, not found.
     *
     * @param ex An EmptyResultDataAccessException instance.
     * @return A ResponseEntity with an empty response body and HTTP status code 404.
     */
    @ExceptionHandler(EmptyResultDataAccessException.class)
    public ResponseEntity<Object> handleEmptyResultDataAccessException(final EmptyResultDataAccessException ex,
                                                                       final WebRequest request) {
        logger.info("> handleEmptyResultDataAccessException");
        logger.warn("- EmptyResultDataAccessException: ", ex);
        final ExceptionDetail detail = new ExceptionDetailBuilder().exception(ex).httpStatus(HttpStatus.NOT_FOUND)
                .webRequest(request).build();
        logger.info("< handleEmptyResultDataAccessException");
        return handleExceptionInternal(ex, detail, new HttpHeaders(), HttpStatus.NOT_FOUND, request);
    }

    /**
     * Handles all Exceptions not addressed by more specific <code>@ExceptionHandler</code> methods. Creates a response
     * with the Exception detail in the response body as JSON and a HTTP status code of 500, internal server error.
     *
     * @param ex An Exception instance.
     * @return A ResponseEntity containing a the Exception attributes in the response body and a HTTP status code 500.
     */
    @ExceptionHandler(Exception.class)
    public ResponseEntity<Object> handleGenericException(final Exception ex, final WebRequest request) {
        logger.info("> handleException");
        logger.error("- Exception: ", ex);
        final ExceptionDetail detail = new ExceptionDetailBuilder().exception(ex)
                .httpStatus(HttpStatus.INTERNAL_SERVER_ERROR).webRequest(request).build();
        logger.info("< handleException");
        return handleExceptionInternal(ex, detail, new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR, request);
    }

    /**
     * Handle ConstraintViolationException
     *
     * @param ex an exception
     * @return an exception response {@link ResponseEntity}
     */
    @ExceptionHandler(value = {ConstraintViolationException.class})
    public ResponseEntity<ResponseMsg<String>> handleConstraintViolationException(ConstraintViolationException ex) {
        return new ResponseEntity<>(new ResponseMsg<String>(HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), ""), HttpStatus.BAD_REQUEST);
    }

    /**
     * Handle MethodArgumentNotValidException
     *
     * @param ex an exception
     * @return an exception response {@link ResponseEntity}
     */
    @ExceptionHandler(value = {MethodArgumentNotValidException.class})
    public ResponseEntity<ResponseMsg<String>> handleMethodArgumentNotValidException(MethodArgumentNotValidException ex) {
        return new ResponseEntity<>(new ResponseMsg<String>(HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), ""), HttpStatus.BAD_REQUEST);
    }

    /**
     * Handle NullPointerException
     *
     * @param ex an exception
     * @return an exception response {@link ResponseEntity}
     */
    @ExceptionHandler(value = {NullPointerException.class})
    public ResponseEntity<ResponseMsg<String>> handleNullPointerException(NullPointerException ex) {
        return new ResponseEntity<>(new ResponseMsg<String>(HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), ""), HttpStatus.BAD_REQUEST);
    }

    /**
     * Handle NoHandlerFoundException
     *
     * @param ex an exception
     * @return an exception response {@link ResponseEntity}
     */
    @ExceptionHandler(value = {NoHandlerFoundException.class})
    public ResponseEntity<ResponseMsg<String>> handleNoHandlerFoundException(NoHandlerFoundException ex) {
        return new ResponseEntity<>(new ResponseMsg<String>(HttpStatus.NOT_FOUND.value(), HttpStatus.NOT_FOUND.getReasonPhrase(), ""), HttpStatus.NOT_FOUND);
    }

    /**
     * Handle Exception
     *
     * @param ex an exception
     * @return an exception response {@link ResponseEntity}
     */
    @ExceptionHandler(value = {Exception.class})
    public ResponseEntity<ResponseMsg<String>> handleException(Exception ex) {
        return new ResponseEntity<>(new ResponseMsg<String>(HttpStatus.INTERNAL_SERVER_ERROR.value(), HttpStatus.INTERNAL_SERVER_ERROR.getReasonPhrase(), ""), HttpStatus.INTERNAL_SERVER_ERROR);
    }

    /**
     * Handle CustomNotFoundException
     *
     * @param ex an exception
     * @return an exception response {@link ResponseEntity}
     */
    @ExceptionHandler(value = {CustomNotFoundException.class})
    public ResponseEntity<ResponseMsg<String>> handleCustomNotFoundException(CustomNotFoundException ex) {
        return new ResponseEntity<>(new ResponseMsg<String>(HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), ""), HttpStatus.BAD_REQUEST);
    }

    /**
     * Handle DTOInControllerNotValidException
     *
     * @param ex an exception
     * @return an exception response {@link ResponseEntity}
     */
    @ExceptionHandler(value = {DTOInControllerNotValidException.class})
    public ResponseEntity<List<ErrorMsg>> handleDTOBindingResultNotValidException(DTOInControllerNotValidException ex) {
        return new ResponseEntity<>(ExceptionUtil.convertBindingResultToListErrorMsg(ex.getBindingResult()), HttpStatus.BAD_REQUEST);
    }

    /**
     * Handle DTOInServiceNotValidException
     *
     * @param ex an exception
     * @return an exception response {@link ResponseEntity}
     */
    @ExceptionHandler(value = DTOInServiceNotValidException.class)
    public ResponseEntity<List<ErrorMsg>> handleDTOErrorMessageNotValidException(DTOInServiceNotValidException ex) {
        return new ResponseEntity<>(ex.getErrorMsgs(), HttpStatus.BAD_REQUEST);
    }
}
