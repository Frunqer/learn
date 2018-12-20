package com.lianjia.test_glz.kafka;

/**
 * Created by guiliangzhou on 2017/7/5.
 */
public class KafkaApplication {
    public static void main(String[] args) {
        KafkaProducer producer=new KafkaProducer(KafkaProperties.TOPIC);
        producer.start();
        KafkaConsumer consumer=new KafkaConsumer(KafkaProperties.TOPIC);
        consumer.start();
    }
}
