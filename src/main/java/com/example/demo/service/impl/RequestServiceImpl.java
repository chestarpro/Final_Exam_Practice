package com.example.demo.service.impl;

import com.example.demo.converter.RequestConverter;
import com.example.demo.entity.Request;
import com.example.demo.model.RequestModel;
import com.example.demo.repository.RequestRepository;
import com.example.demo.service.RequestService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class RequestServiceImpl implements RequestService {
    private final RequestRepository repository;
    private final RequestConverter converter;

    @Override
    public RequestModel createRequest() {
        Request request = new Request();
        repository.save(request);
        return converter.convertFromEntity(request);
    }

    @Override
    public Long getCountAllRequest() {
        return repository.count();
    }

    @Override
    public List<RequestModel> getAllRequest() {
        return repository.findAll()
                .stream()
                .map(converter::convertFromEntity)
                .collect(Collectors.toList());
    }
}