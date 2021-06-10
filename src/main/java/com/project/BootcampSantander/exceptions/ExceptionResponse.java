package com.project.BootcampSantander.exceptions;

public class ExceptionResponse {

    private final String message;

    ExceptionResponse(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
