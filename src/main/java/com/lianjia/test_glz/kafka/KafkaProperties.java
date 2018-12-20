package com.lianjia.test_glz.kafka;

/**
 * Created by guiliangzhou on 2017/7/5.
 */
public interface KafkaProperties {
   final static String ZK_CONNECT="10.30.128.206:2181";
   final static String GROUPID="group2";
   final static String TOPIC="topic2";
   final static String KAFKA_CONNECT="10.30.128.206:9092";
   final static int KAFKA_PRODUCERBUFFERSIZE=64*1024;
   final static int KAFKA_CONNECT_TIMEOUT=20000;
   final static int RECONNECT_INTERVAL=10000;
   final static String TOPIC2="topic2";
   final static String TOPIC3="topic3";
   final static String CLIENTID="SimpleConsumerDemoClient";

}
