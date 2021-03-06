package com.pangaea.pangaeaassessment.services;

import com.pangaea.pangaeaassessment.domain.ReqBody;
import com.pangaea.pangaeaassessment.utils.PubSubListener;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PublisherService {

    private final ResponseService responseService;

    public ResponseEntity<?> publish(String topic, ReqBody reqBody) {

        //I decide to go with a normal Java Bean so as not to allow the Pub/Sub implementation to be to Spring Reliant
        PubSubListener pubSubListener = new PubSubListener();
        pubSubListener.publish(topic, reqBody);

        return responseService.getResponse(topic, reqBody);
    }
}
