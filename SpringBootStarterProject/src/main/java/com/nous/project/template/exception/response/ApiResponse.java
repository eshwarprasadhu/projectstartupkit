package com.nous.project.template.exception.response;

import org.springframework.http.HttpStatus;

public class ApiResponse {

    private final HttpStatus status;
    private final int code;
    private final String message;

    public ApiResponse(HttpStatus status, int code, String message) {
        this.status = status;
        this.code = code;
        this.message = message;
    }

    public HttpStatus getStatus() {
        return status;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "ApiErrorResponse{" + "status=" + status + ", code=" + code + ", message=" + message + '}';
    }
}
