package com.example.rabbit_mq_learn;

import com.example.rabbit_mq_learn.configuration.RabbitConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(RabbitConfiguration.class)
public class RabbitMqLearnApplication {

	public static void main(String[] args) {
		SpringApplication.run(RabbitMqLearnApplication.class, args);
	}

}
