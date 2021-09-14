package com.pangaea.pangaeaassessment.utils;

import com.pangaea.pangaeaassessment.domain.ReqBody;
import com.pangaea.pangaeaassessment.domain.ResBody;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class PubSubListener {
    static ConcurrentMap<String, Object> concurrentMap = null;

    //A  singleton to statically get items from a Concurrent Map
    public static ConcurrentMap getConcurrentMap() {
        if (concurrentMap == null || concurrentMap.isEmpty()) {
            concurrentMap = new ConcurrentHashMap();
        }
        return concurrentMap;
    }

    public void publish(String topic, ReqBody reqBody) {
        getConcurrentMap().putIfAbsent(topic, reqBody);
    }

    public ResBody subscribe(String topic) {
        ReqBody reqBody = (ReqBody) getConcurrentMap().get(topic);
        getConcurrentMap().remove(topic);
        ResBody resBody = new ResBody();
        resBody.setData(reqBody);
        resBody.setTopic(topic);
        return resBody;
    }
}
