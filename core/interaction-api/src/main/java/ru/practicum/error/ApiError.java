package ru.practicum.error;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;

@Data
@FieldDefaults(level= AccessLevel.PRIVATE)
public class ApiError {
    String name;
    String url;
    String reason;
    Integer status;
    String message;
    LocalDateTime timestamp;

    public ApiError(String name, String url, Integer status, String reason, Throwable ex) {
        this.name = name;
        this.url = url;
        this.reason = reason;
        this.status = status;
        this.message = ex.getMessage();
        this.timestamp = LocalDateTime.now();
    }
}
