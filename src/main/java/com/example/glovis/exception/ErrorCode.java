package com.example.glovis.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum ErrorCode {
    INVALID_PARAMETER(400, "my invalid parameter!!!"),
    DATA_NOT_FOUND(404, "my no data!!!");

    private final int status;
    private final String message;
}
