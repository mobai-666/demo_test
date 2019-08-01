package com.lalala.test;

import java.util.ArrayList;
import java.util.List;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(3)
public class A3 {

	public A3() {
		System.out.println("a3");
		
		
		
	}

}
