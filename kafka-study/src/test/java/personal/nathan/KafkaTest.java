package personal.nathan;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import personal.nathan.domain.Message;
import personal.nathan.producer.MessageProducer;

/**
 * Created by za-zhangwei002 on 2019/2/25.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = {KafkaApplication.class})
public class KafkaTest {

    @Autowired
    private MessageProducer messageProducer;

    @Test
    public void testProduceMsg() {
        Message message = new Message();
        message.setId(1L);
        message.setMsg("tst");
        messageProducer.produce(message);
    }
}
