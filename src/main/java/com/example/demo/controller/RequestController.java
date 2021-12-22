package com.example.demo.controller;

import com.example.demo.model.RequestModel;
import com.example.demo.service.RequestService;
import com.example.demo.util.ResponseMessage;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping
@RequiredArgsConstructor
public class RequestController {
    private final RequestService requestService;

    @PostMapping("/counter")
    public ResponseMessage<RequestModel> save() {
        return new ResponseMessage<RequestModel>()
                .prepareSuccessMessage(requestService.createRequest());
    }

    @GetMapping("/counter")
    public ResponseMessage<Long> getCountAllRequest() {
        return new ResponseMessage<Long>()
                .prepareSuccessMessage(requestService.getCountAllRequest());
    }

    @GetMapping("/report")
    public ResponseMessage<List<RequestModel>> getAll() {
        return new ResponseMessage<List<RequestModel>>()
                .prepareSuccessMessage(requestService.getAllRequest());
    }
}