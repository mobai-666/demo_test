package com.lalala.rabbitMq;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class TestAmqListener {
	@RabbitListener(queues = "testAmq")
	public void rec(String msg) {
		System.out.println("监听端消费--"+msg);
		
	}

}
