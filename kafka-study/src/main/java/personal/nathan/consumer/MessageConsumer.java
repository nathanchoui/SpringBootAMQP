package personal.nathan.consumer;

import com.google.gson.Gson;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    private Gson gson;

    @KafkaListener(topics = {"test"}, groupId = "groupA")
    public void consumeA(ConsumerRecord record) {
        Optional kafkaMessage = Optional.ofNullable(record.value());
        if (kafkaMessage.isPresent()) {
            Object message = kafkaMessage.get();
            this.printInfo("consumeA", record, message);
        }
    }

    @KafkaListener(topics = {"test"}, groupId = "groupB")
    public void consumeB(ConsumerRecord record) {
        Optional kafkaMessage = Optional.ofNullable(record.value());
        if (kafkaMessage.isPresent()) {
            Object message = kafkaMessage.get();
            this.printInfo("consumeB", record, message);
        }
    }

    @KafkaListener(topics = {"test"}, groupId = "groupA")
    public void consumeC(ConsumerRecord record) {
        Optional kafkaMessage = Optional.ofNullable(record.value());
        if (kafkaMessage.isPresent()) {
            Object message = kafkaMessage.get();
            this.printInfo("consumeC", record, message);
        }
    }

    private void  printInfo(String id, ConsumerRecord record, Object message) {
        System.out.println("============" + id +"============");
        System.out.println("record: " + gson.toJson(record));
        System.out.println("message: " + gson.toJson(message));
        System.out.println("============" + id +"============");
    }
}
