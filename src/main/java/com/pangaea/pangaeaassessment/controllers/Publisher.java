package com.pangaea.pangaeaassessment.controllers;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping(value = "/publish")
@RequiredArgsConstructor
public class Publisher {
    @PostMapping("/{topic}")
    public ResponseEntity<?> publish(@PathVariable String topic) {
        return null;
    }
}
