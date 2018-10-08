package com.sapient.metallica.helpers;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.sapient.metallica.Entities.TradeEntity;

@Component
public class RabbitMQSender {

	@Autowired
	private AmqpTemplate rabbitTemplate;
	
	@Value("${queue.name}")
	private String queue;
	
	public void send(TradeEntity trade) {
		System.out.println(queue);
		rabbitTemplate.convertAndSend(queue, trade);
		System.out.println("Send msg = " + trade);
	}
}
