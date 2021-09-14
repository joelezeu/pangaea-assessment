package com.pangaea.pangaeaassessment.controllers;

import com.pangaea.pangaeaassessment.services.SubscriberService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping(value = "/subscribe")
@RequiredArgsConstructor
public class Subscriber1 {
    private final SubscriberService subscriberService;

    @PostMapping("/{topic}")
    public ResponseEntity<?> publish(@PathVariable String topic) {
        return subscriberService.subscribe(topic);
    }
}
