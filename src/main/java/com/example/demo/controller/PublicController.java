package com.example.demo.controller;

import com.example.demo.model.SoftnetDto;
import com.example.demo.service.SoftnetService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/public")
@RequiredArgsConstructor
public class PublicController {
    final SoftnetService softnetService;

    @GetMapping
    ResponseEntity<SoftnetDto> getSoftnet() {
        return ResponseEntity.ok().body(softnetService.getSoftnet());
    }
}
