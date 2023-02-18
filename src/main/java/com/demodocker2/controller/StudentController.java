package com.demodocker2.controller;

import com.demodocker2.service.StService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class StudentController {

    private final StService service;


    @GetMapping("/")
    public ResponseEntity<?> saveAll() {
        return ResponseEntity.ok().body(service.saveAllStudent());
    }

    @GetMapping("/get-all")
    public ResponseEntity<?> getAll() {
        return ResponseEntity.ok().body(service.getAllStudent());
    }





}
