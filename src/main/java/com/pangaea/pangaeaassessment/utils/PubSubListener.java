package com.pangaea.pangaeaassessment.utils;

import com.pangaea.pangaeaassessment.domain.ReqBody;
import com.pangaea.pangaeaassessment.domain.ResBody;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class PubSubListener {
    static ConcurrentMap<String, Object> concurrentMap = null;

    //A  singleton to statically get items from a Concurrent Map
    //ConcurrentMap gives the ability for the Subscriber to access the data from the publisher Concurrently.
    //Decision to use ConcurrentMap was to make the assessment as simple as possible
    //Only disadvantage is that it can only work in the same process, meaning, both Publisher and the Subscriber will
    //reside in this process.
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
