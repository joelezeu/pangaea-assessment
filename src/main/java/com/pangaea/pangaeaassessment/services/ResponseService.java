package com.pangaea.pangaeaassessment.services;

import com.pangaea.pangaeaassessment.domain.ReqBody;
import com.pangaea.pangaeaassessment.domain.ResBody;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ResponseService {
    public ResponseEntity<?> getResponse(ResBody resBody) {
        return ResponseEntity.ok(resBody);
    }

    public ResponseEntity<?> getResponse(String topic, ReqBody reqBody) {
        ResBody resBody = new ResBody();
        resBody.setTopic(topic);
        resBody.setData(reqBody);
        return ResponseEntity.ok(resBody);
    }
}
