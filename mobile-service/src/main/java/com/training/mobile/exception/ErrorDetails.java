package com.training.mobile.exception;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ErrorDetails {
    private int errorCode;
    private String errorMessage;

}
