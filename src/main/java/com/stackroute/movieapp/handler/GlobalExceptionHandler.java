package com.stackroute.movieapp.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler
    public ResponseEntity<String> handleException(Exception e)
    {
        return new ResponseEntity<String>("globaL EXCEPTION thrown here", HttpStatus.CONFLICT);
    }
}
