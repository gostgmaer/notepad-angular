package com.demo.notepad.web.rest.dto;

import org.springframework.http.HttpStatus;

public class ErrorResponse {

    private HttpStatus httpStatus;
    private String message;

    public ErrorResponse() {
    }

    public ErrorResponse(HttpStatus httpStatus, String message) {
        this.httpStatus = httpStatus;
        this.message = message;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }

    public void setHttpStatus(HttpStatus httpStatus) {
        this.httpStatus = httpStatus;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
