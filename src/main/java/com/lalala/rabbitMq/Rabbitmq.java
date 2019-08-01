package com.lalala.rabbitMq;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Rabbitmq {
	 public static final String MIAOSHA_QUEUE = "testAmq";
	
	@Bean
	public Queue qu() {
		return new Queue(MIAOSHA_QUEUE);
	}
}
