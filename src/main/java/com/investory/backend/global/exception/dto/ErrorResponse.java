package com.investory.backend.global.exception.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ErrorResponse {

    private boolean success = false;
    private String code;
    private String message;
    private LocalDateTime timestamp;
    private List<FieldError> errors;

    public static ErrorResponse of(String code, String message) {
        return new ErrorResponse(false, code, message, LocalDateTime.now(), null);
    }

    public static ErrorResponse of(String code, String message, List<FieldError> errors) {
        return new ErrorResponse(false, code, message, LocalDateTime.now(), errors);
    }

    @Getter
    @AllArgsConstructor
    public static class FieldError {
        private String field;
        private String value;
        private String reason;

        public static FieldError of(String field, String value, String reason) {
            return new FieldError(field, value, reason);
        }
    }
}