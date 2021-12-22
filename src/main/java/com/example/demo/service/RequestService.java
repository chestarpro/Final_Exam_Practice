package com.example.demo.service;

import com.example.demo.model.RequestModel;

import java.util.List;

public interface RequestService {
    RequestModel createRequest();
    Long getCountAllRequest();
    List<RequestModel> getAllRequest();
}