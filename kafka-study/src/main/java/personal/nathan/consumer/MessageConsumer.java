package personal.nathan.consumer;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * Description:
 * <p>
 * Created by nathan.z on 2018/8/1.
 */
@Service
public class MessageConsumer {

    @KafkaListener(topics = {"test"})
    public void consume(ConsumerRecord record) {
        Optional kafkaMessage = Optional.ofNullable(record.value());
        if (kafkaMessage.isPresent()) {
            Object message = kafkaMessage.get();
            System.out.println("" + record);
            System.out.println("" + message);
        }
    }
}
