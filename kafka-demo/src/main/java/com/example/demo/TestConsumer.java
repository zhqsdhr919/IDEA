package com.example.demo;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class TestConsumer {
    @KafkaListener(topics = "test-001",groupId = "test3")
    public void listen(String record) {
        System.out.println("【*** 消费者开始接收消息 ***】======" + record);
    }


    /**
     * 批量消费
     * 对应yml中spring.kafka.listener.type
     * @param records
     */
//   // @KafkaListener(topics = "outboundCallInfo")
//
//    @KafkaListener(topicPartitions = { @TopicPartition(topic = "test", partitions = {"2" })})
//    public void listenBatch(List<ConsumerRecord<String, String>> records) {
//        System.out.println("【*** 消费者批量开始接收消息 ***大小】======" + records.size());
//        records.forEach(record -> System.out.println("【*** 消费者批量开始接收消息 ***】======" + record.value()));
//    }



//
//    @KafkaListener(topics = "rowDataTopic")
//    public void listenBatch2(List<ConsumerRecord<String, String>> records) {
//        records.forEach(record -> System.out.println("【*** 消费者批量开始接收消息 subscribeTopic***】======" + record.value()));
//    }

}
