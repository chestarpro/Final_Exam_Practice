package com.example.demo.repository;

import com.example.demo.entity.Request;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface RequestRepository extends JpaRepository<Request, Long> {
    @Query(value = "SELECT COUNT(*) FROM requests", nativeQuery = true)
    Long getCountAllRequest();
}