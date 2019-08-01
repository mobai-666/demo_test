package com.lalala.mq;

import org.springframework.jms.annotation.JmsListener;

//@Component
public class TestQListener {
	@JmsListener(destination = "testQP")
	public void onMessage(String message) {

		System.out.println("active消费="+message);
	}
}
