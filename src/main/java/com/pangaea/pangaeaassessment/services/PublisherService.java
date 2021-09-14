package com.pangaea.pangaeaassessment.services;

import com.pangaea.pangaeaassessment.domain.ReqBody;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PublisherService {
    public ResponseEntity<?> publish(String topic, ReqBody resBody) {
        return null;
    }
}
