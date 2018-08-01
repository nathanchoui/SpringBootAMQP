package personal.nathan.producer;

import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import personal.nathan.domain.Message;

/**
 * Description:
 * <p>
 * Created by nathan.z on 2018/8/1.
 */
@Service
public class MessageProducer {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @Autowired
    private Gson gson;

    public void produce(Message message) {
        kafkaTemplate.send("test", gson.toJson(message));
    }
}
