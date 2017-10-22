package com.github.nguyentrucxinh.web.api;

import com.github.nguyentrucxinh.helper.exception.DTOInControllerNotValidException;
import com.github.nguyentrucxinh.helper.exception.DTOInServiceNotValidException;
import com.github.nguyentrucxinh.helper.response.ExceptionDetail;
import com.github.nguyentrucxinh.helper.response.ExceptionDetailBuilder;
import com.github.nguyentrucxinh.helper.util.ExceptionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import javax.persistence.NoResultException;
import javax.validation.ConstraintViolationException;

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

    /*
    * MethodArgumentNotValidException
    * NullPointerException
    * NoHandlerFoundException
    * CustomNotFoundException
    * */

    /**
     * Handles {@link ConstraintViolationException}
     *
     * @param ex      An Exception instance.
     * @param request the {@link WebRequest}
     * @return A ResponseEntity containing a the Exception attributes
     */
    @ExceptionHandler(ConstraintViolationException.class)
    public ResponseEntity<Object> handleConstraintViolationException(final ConstraintViolationException ex, final WebRequest request) {
        logger.info("> handleException");
        logger.error("- Exception: ", ex);
        final ExceptionDetail detail = new ExceptionDetailBuilder().exception(ex).exceptionDetail(ExceptionUtils.convertConstraintViolationExceptionToListErrorMsg(ex))
                .httpStatus(HttpStatus.INTERNAL_SERVER_ERROR).webRequest(request).build();
        logger.info("< handleException");
        return handleExceptionInternal(ex, detail, new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR, request);
    }

    /**
     * Handles {@link DTOInControllerNotValidException}
     *
     * @param ex      An Exception instance.
     * @param request the {@link WebRequest}
     * @return A ResponseEntity containing a the Exception attributes
     */
    @ExceptionHandler(DTOInControllerNotValidException.class)
    public ResponseEntity<Object> handleDTOInControllerNotValidException(final DTOInControllerNotValidException ex, final WebRequest request) {
        logger.info("> handleException");
        logger.error("- Exception: ", ex);
        final ExceptionDetail detail = new ExceptionDetailBuilder().exception(ex).exceptionDetail(ExceptionUtils.convertBindingResultToListErrorMsg(ex.getBindingResult()))
                .httpStatus(HttpStatus.INTERNAL_SERVER_ERROR).webRequest(request).build();
        logger.info("< handleException");
        return handleExceptionInternal(ex, detail, new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR, request);
    }

    /**
     * Handles {@link DTOInServiceNotValidException}
     *
     * @param ex      An Exception instance.
     * @param request the {@link WebRequest}
     * @return A ResponseEntity containing a the Exception attributes
     */
    @ExceptionHandler(DTOInServiceNotValidException.class)
    public ResponseEntity<Object> handleDTOInServiceNotValidException(final DTOInServiceNotValidException ex, final WebRequest request) {
        logger.info("> handleException");
        logger.error("- Exception: ", ex);
        final ExceptionDetail detail = new ExceptionDetailBuilder().exception(ex).exceptionDetail(ex.getErrorMsgs())
                .httpStatus(HttpStatus.INTERNAL_SERVER_ERROR).webRequest(request).build();
        logger.info("< handleException");
        return handleExceptionInternal(ex, detail, new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR, request);
    }
}
