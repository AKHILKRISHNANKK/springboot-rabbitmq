package com.example.demo.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import com.example.demo.entities.OrderStatus;
import com.example.demo.utils.RabbitMQConstants;

@Component
public class User {
	
	@RabbitListener(queues = RabbitMQConstants.queue)
	public void consumeMessageFromQueue(OrderStatus orderStatus) {
		System.out.println("Message recieved from queue : " + orderStatus.getMessage()+""+orderStatus.getStatus());
	}

}
