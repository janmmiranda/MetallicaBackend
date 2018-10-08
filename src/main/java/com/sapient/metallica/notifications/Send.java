package com.sapient.metallica.notifications;

import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.Channel;

public class Send {

	private final static String QUEUE_NAME = "hello";
	
	public void Send() throws Exception {
		
		ConnectionFactory factory = new ConnectionFactory();
		factory.setHost("localhost");
		Connection connection = factory.newConnection();
		Channel channel = connection.createChannel();
		
		channel.queueDeclare(QUEUE_NAME, false, false, false, null);
		String message = "Hello World";
		channel.basicPublish("", QUEUE_NAME, null, message.getBytes("UTF-8"));
		
		channel.close();
		connection.close();
	}
}
