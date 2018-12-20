package com.lianjia.test_glz.kafka;

import kafka.javaapi.producer.Producer;
import kafka.producer.KeyedMessage;
import kafka.producer.ProducerConfig;

import java.util.Properties;

/**
 * Created by guiliangzhou on 2017/7/5.
 */
public class KafkaProducer extends Thread {
    private Producer<Integer,String> producer;
    private String topic;
    private final Properties props=new Properties();

    public KafkaProducer(String topic){
        props.put("serializer.class","kafka.serializer.StringEncoder");
        props.put("metadata.broker.list",KafkaProperties.KAFKA_CONNECT);
        producer=new Producer<Integer, String>(new ProducerConfig(props));
        this.topic=topic;
    }

    @Override
    public void run() {
        try {
            int messageNo = 1;

            while (true) {
                String messageStr = "kafka_Message_" + messageNo;
                System.out.println("Send: " + messageStr);
                producer.send(new KeyedMessage(this.topic, messageStr));
                messageNo++;
                sleep(3000);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
