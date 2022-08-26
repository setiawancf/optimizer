package com.example.optimizer.exception.advice;

import com.example.optimizer.exception.RuneNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
class RuneNotFoundAdvice {

  @ResponseBody
  @ExceptionHandler(RuneNotFoundException.class)
  @ResponseStatus(HttpStatus.NOT_FOUND)
  String employeeNotFoundHandler(RuneNotFoundException ex) {
    return ex.getMessage();
  }
}