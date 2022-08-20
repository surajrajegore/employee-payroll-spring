package com.bridgelabz.employeepayrollservice.dto;

public class ResponseDto {
    private String message;
    private Object data;

    public String getMessage() {
        return message;
    }

    public ResponseDto(String message, Object data) {
        this.message = message;
        this.data = data;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
