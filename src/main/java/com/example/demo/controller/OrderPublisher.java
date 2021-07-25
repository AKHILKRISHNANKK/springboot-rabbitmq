package com.example.demo.controller;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Order;
import com.example.demo.entities.OrderStatus;
import com.example.demo.utils.RabbitMQConstants;

@RestController
@RequestMapping("/order")
public class OrderPublisher {

	@Autowired
	private RabbitTemplate template;

	@PostMapping("/{restaurentName}")
	public String bookOrder(@RequestBody Order order, @PathVariable String restaurentName) {
		OrderStatus orderStatus = new OrderStatus(order, RabbitMQConstants.in_process,
				"Order is  processed in" + restaurentName);
		template.convertAndSend(RabbitMQConstants.exchange, RabbitMQConstants.routing_key, orderStatus);
		return "Success !";
	}

}
