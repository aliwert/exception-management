package com.alimert.exception;


import lombok.Getter;

@Getter
public enum MessageType {
    NO_RECORD_EXIST("1001", "Employee not found"),
    GENERAL_EXCEPTION("9999", "General exception");

    private String code;
    private String message;

    MessageType(String code, String message) {
        this.code = code;
        this.message = message;
    }
}
