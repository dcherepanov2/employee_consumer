package com.example.rabbit_mq_learn.configuration;

import org.springframework.amqp.core.AmqpAdmin;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitAdmin;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitConfiguration {

    @Bean
    public ConnectionFactory connectionFactory(){
        return new CachingConnectionFactory("localhost", 5672);
    }

    @Bean
    public AmqpAdmin amqpAdmin(){
        return new RabbitAdmin(connectionFactory());
    }

    @Bean
    public RabbitTemplate rabbitTemplate(){
        return new RabbitTemplate(connectionFactory());
    }

    @Bean
    public Queue myQueue(){
        return new Queue("myQueue");
    }

    @Bean
    public Queue myQueue1(){
        return new Queue("myQueue1");
    }

//    @Bean
//    public SimpleMessageListenerContainer messageListenerContainer(){
//        SimpleMessageListenerContainer container = new SimpleMessageListenerContainer();
//        container.setConnectionFactory(connectionFactory());
//        container.setQueueNames(myQueue().getName(), myQueue1().getName());
//        container.setMessageListener(System.out::println);
//        return container;
//    }
}
