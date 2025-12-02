package com.roadrescue.controller;

import com.roadrescue.entity.ServiceRequest;
import com.roadrescue.repository.ServiceRequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api/requests")
public class RequestController {
    @Autowired
    private ServiceRequestRepository repo;

    @PostMapping("/create")
    public ServiceRequest create(@RequestBody ServiceRequest r){
        r.setStatus("PENDING");
        r.setCreatedAt(LocalDateTime.now());
        return repo.save(r);
    }

    @GetMapping("/all")
    public List<ServiceRequest> all(){ return repo.findAll(); }
}
