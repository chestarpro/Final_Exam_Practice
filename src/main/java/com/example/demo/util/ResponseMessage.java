package com.example.demo.util;

import lombok.Data;

import java.util.List;
@Data
public class ResponseMessage<T> {
    private T value;
    private List<T> listValue;
    private String status;
    private String details;

    public ResponseMessage<T> prepareSuccessMessage(T value) {
        ResponseMessage<T> successMessage = new ResponseMessage<>();
        successMessage.setValue(value);
        successMessage.setStatus("OK");
        successMessage.setDetails(null);
        return successMessage;
    }

    public ResponseMessage<T> prepareFailMessage(String details) {
        ResponseMessage<T> failMessage = new ResponseMessage<>();
        failMessage.setStatus("FAIL");
        failMessage.setValue(null);
        failMessage.setDetails(details);
        return failMessage;
    }

    public ResponseMessage<T> prepareErrorMessage(String details) {
        ResponseMessage<T> errorMessage = new ResponseMessage<>();
        errorMessage.setStatus("ERROR");
        errorMessage.setValue(null);
        errorMessage.setDetails(details);
        return errorMessage;
    }
}