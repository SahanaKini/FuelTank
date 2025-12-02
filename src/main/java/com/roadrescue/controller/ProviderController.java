package com.roadrescue.controller;

import com.roadrescue.entity.ServiceProvider;
import com.roadrescue.repository.ServiceProviderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/providers")
public class ProviderController {
    @Autowired
    private ServiceProviderRepository repo;

    @PostMapping("/signup")
    public ServiceProvider signup(@RequestBody ServiceProvider p){
        return repo.save(p);
    }

    @GetMapping("/all")
    public List<ServiceProvider> all(){
        return repo.findAll();
    }
}
