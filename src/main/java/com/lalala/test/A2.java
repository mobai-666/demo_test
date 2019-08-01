package com.lalala.test;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(2)
public class A2 {

	public A2() {
		System.out.println("a2");
	}
	

}
