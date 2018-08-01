package personal.nathan;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * Description:
 * <p>
 * Created by nathan.z on 2018/7/29.
 */
@SpringBootApplication
public class KafkaApplication {

    @Bean
    public Gson gson() {
        return new GsonBuilder().create();
    }

    public static void main(String[] args) {
        SpringApplication.run(KafkaApplication.class, args);
    }
}
