package com.stackiamo.ecommerce.exception;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Setter
@Getter
@NoArgsConstructor
public class ResponseDetails {
    @JsonFormat(pattern = "dd/MM/yyyy HH:mm:ss")
    private LocalDateTime timestamp;
    private String message;
    private String details;
    private Integer status;
    private String requestType;
    private Boolean success;
    private Boolean isCompleted;
}


