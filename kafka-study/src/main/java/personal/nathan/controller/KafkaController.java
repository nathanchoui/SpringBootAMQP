package personal.nathan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import personal.nathan.domain.Message;
import personal.nathan.producer.MessageProducer;

/**
 * Created by za-zhangwei002 on 2019/2/25.
 */
@RestController
public class KafkaController {

    @Autowired
    private MessageProducer producer;

    @PostMapping("/producer")
    public String produce(@RequestBody Message message) {
        producer.produce(message);
        return "OK";
    }
}
