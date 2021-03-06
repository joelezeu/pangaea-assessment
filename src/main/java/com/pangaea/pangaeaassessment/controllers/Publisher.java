package com.pangaea.pangaeaassessment.controllers;

import com.pangaea.pangaeaassessment.domain.ReqBody;
import com.pangaea.pangaeaassessment.services.PublisherService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping(value = "/publish")
@RequiredArgsConstructor
public class Publisher {
    private final PublisherService publisherService;

    @PostMapping("/{topic}")
    public ResponseEntity<?> publish(@PathVariable String topic, @RequestBody ReqBody requestBody) {
        return publisherService.publish(topic, requestBody);
    }
}
