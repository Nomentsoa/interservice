package ca.lazanomentsoa.consummer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
public class ConsummerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsummerApplication.class, args);
    }

}
