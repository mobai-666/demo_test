package com.lalala.test;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class A1 {

	public A1() {
		System.out.println("a1");
	}
	

}
