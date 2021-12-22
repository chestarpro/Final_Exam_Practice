package com.example.demo.model;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class RequestModel {
    private Long id;
    private LocalDateTime createDate;
}