package com.example.demo.service;

import com.example.demo.model.SoftnetDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SoftnetServiceImpl implements SoftnetService {

    @Override
    public SoftnetDto getSoftnet() {
        return SoftnetDto.builder()
                .name("Softnet")
                .build();
    }
}
