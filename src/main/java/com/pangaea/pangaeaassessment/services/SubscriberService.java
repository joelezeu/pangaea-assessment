package com.pangaea.pangaeaassessment.services;

import com.pangaea.pangaeaassessment.utils.PubSubListener;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SubscriberService {
    private final ResponseService responseService;

    public ResponseEntity<?> subscribe(String topic) {
        //I decide to go with a normal Java Bean so as not to allow the Pub/Sub implementation to be to Spring Reliant
        PubSubListener pubSubListener = new PubSubListener();
        return responseService.getResponse(pubSubListener.subscribe(topic));
    }
}
