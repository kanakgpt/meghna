package com.intuit.hello_world.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data

public class APIResponse <T> {
    private int status;
    private String message;
    private T data;
    private String developerMessage;

    public APIResponse(int status, String message, T data, String developerMessage) {
        this.status = status;
        this.message = message;
        this.data = data;
        this.developerMessage = developerMessage;
    }
}
