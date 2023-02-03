package com.example.rabbit_mq_learn.controllers;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    private final AmqpTemplate amqpTemplate;

    @Autowired
    public EmployeeController(AmqpTemplate amqpTemplate) {
        this.amqpTemplate = amqpTemplate;
    }

    @GetMapping("/getOneselfEmployee")
    public String getOneselfEmployee(){
        for (int i = 0;i <10  ;i++)
            amqpTemplate.convertAndSend("myQueue", "Vasya");
        return "Vasya";
    }
}
