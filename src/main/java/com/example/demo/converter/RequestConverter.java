package com.example.demo.converter;

import com.example.demo.entity.Request;
import com.example.demo.exception.ApiFailException;
import com.example.demo.model.RequestModel;
import org.springframework.stereotype.Component;

@Component
public class RequestConverter extends BaseConverter<RequestModel, Request> {
    public RequestConverter() {
        super(RequestConverter::convertToEntity, RequestConverter::convertToModel);
    }

    private static RequestModel convertToModel(Request entityToConvert) {
        if (entityToConvert == null) return null;

        RequestModel requestModel = new RequestModel();
        requestModel.setId(entityToConvert.getId());
        requestModel.setCreateDate(entityToConvert.getCreateDate());

        return requestModel;
    }

    private static Request convertToEntity(RequestModel requestModelToConvert) {
        throw new ApiFailException("Access is denied");
    }
}