package com.nous.project.template.exception;

public class ApiErrorResponse {

    private final int status;
    private final int code;
    private final String message;

    public ApiErrorResponse(int status, int code, String message) {
        this.status = status;
        this.code = code;
        this.message = message;
    }

    public int getStatus() {
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
