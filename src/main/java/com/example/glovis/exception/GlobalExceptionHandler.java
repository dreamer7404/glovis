package com.example.glovis.exception;

import com.example.glovis.exception.CustomException;
import com.example.glovis.exception.ErrorDto;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
//import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

//    @ExceptionHandler({ CustomException.class })
//    protected ResponseEntity handleCustomException(CustomException ex) {
//        return new ResponseEntity(new ErrorDto(ex.getErrorCode().getStatus(), ex.getErrorCode().getMessage()), HttpStatus.valueOf(ex.getErrorCode().getStatus()));
//    }
//
//    @ExceptionHandler({ MissingServletRequestParameterException.class })
//    protected ResponseEntity handleCustomException2(CustomException ex) {
//        return new ResponseEntity(new ErrorDto(ex.getErrorCode().getStatus(), ex.getErrorCode().getMessage()), HttpStatus.valueOf(ex.getErrorCode().getStatus()));
//    }
//
//    @ExceptionHandler({ MethodArgumentNotValidException.class })
//    protected ResponseEntity methodArgumentNotValidException(CustomException ex) {
//        return new ResponseEntity(new ErrorDto(ex.getErrorCode().getStatus(), ex.getErrorCode().getMessage()), HttpStatus.valueOf(ex.getErrorCode().getStatus()));
//    }

//    @Override
//    protected ResponseEntity<Object> handleMissingServletRequestParameter(
//            MissingServletRequestParameterException ex, HttpHeaders headers,
//            HttpStatus status, WebRequest request) {
//        String error = ex.getParameterName() + " parameter is missing";
//
//        ApiError apiError =
//                new ApiError(HttpStatus.BAD_REQUEST, ex.getLocalizedMessage(), error);
//        return new ResponseEntity<Object>(
//                apiError, new HttpHeaders(), apiError.getStatus());
//    }


    @Override
    protected ResponseEntity<Object> handleMissingServletRequestParameter(MissingServletRequestParameterException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
        return super.handleMissingServletRequestParameter(ex, headers, status, request);
    }

    // TypeMismatch
    @Override
    protected ResponseEntity<Object> handleHttpMessageNotReadable(HttpMessageNotReadableException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
//        return super.handleHttpMessageNotReadable(ex, headers, status, request);
//        return new ResponseEntity(new ErrorDto(400, "my bad request!!!!"), )HttpStatus.BAD_REQUEST;
        return new ResponseEntity(new ErrorDto(status.value(), status.name()), HttpStatus.BAD_REQUEST);
    }

//    @ExceptionHandler( HttpMessageNotReadableException.class )
//    protected ResponseEntity httpMessageNotReadableException(CustomException ex) {
//        return new ResponseEntity(new ErrorDto(ex.getErrorCode().getStatus(), ex.getErrorCode().getMessage()), HttpStatus.valueOf(ex.getErrorCode().getStatus()));
//    }
}
