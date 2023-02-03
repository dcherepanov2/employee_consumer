package com.example.rabbit_mq_learn.listeners;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@EnableRabbit
@Component
public class RabbitMqListener {

    private Logger logger = Logger.getLogger(RabbitMqListener.class.getName());
    @RabbitListener(queues = "myQueue")
    public String processMyQueue(String message){
        return "Queue is worked";
    }

    @RabbitListener(queues = "myQueue")
    public String processMyQueue1(String message){
        return "Queue1 is worked";
    }
}
