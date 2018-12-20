package com.lianjia.test_glz.kafka;


import kafka.consumer.Consumer;
import kafka.consumer.ConsumerConfig;
import kafka.consumer.ConsumerIterator;
import kafka.consumer.KafkaStream;
import kafka.javaapi.consumer.ConsumerConnector;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
;

/**
 * Created by guiliangzhou on 2017/7/5.
 */
public class KafkaConsumer extends Thread{
    private ConsumerConnector consumer;
    private  String topic;
    public KafkaConsumer(String topic){
        consumer = Consumer.createJavaConsumerConnector(createConsumerConfig());
        this.topic=topic;
    }

    private static ConsumerConfig createConsumerConfig(){
        Properties props=new Properties();
        props.put("zookeeper.connect",KafkaProperties.ZK_CONNECT);
        props.put("group.id",KafkaProperties.GROUPID);
        props.put("zookeeper.session.timeout.ms","6000");
        props.put("zookeeper.sync.time.ms","2000");
        props.put("auto.commit.interval.ms","1000");
        return new ConsumerConfig(props);
    }

    public void run() {
        Map<String, Integer> topicCountMap = new HashMap<String, Integer>();
        topicCountMap.put(topic, 1);
        Map<String, List<KafkaStream<byte[], byte[]>>> consumerMap = consumer.createMessageStreams(topicCountMap);
        KafkaStream<byte[], byte[]> stream = consumerMap.get(topic).get(0);
        ConsumerIterator<byte[], byte[]> it = stream.iterator();
        while (it.hasNext()) {
            System.out.println("receive: " + new String(it.next().message()));
            try {
                sleep(3000);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
